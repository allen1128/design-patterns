package com.sap.set.pf.packaging.service.basic

import com.sap.set.pf.packaging.service.exception.ResourceNotFoundException
import com.sap.set.pf.packaging.service.exception.SearchFailedException
import com.sap.set.pf.packaging.service.exception.ValidationException
import grails.converters.JSON
import org.apache.commons.lang.exception.ExceptionUtils
import org.elasticsearch.action.search.SearchResponse
import org.elasticsearch.common.xcontent.ToXContent
import org.elasticsearch.common.xcontent.XContentBuilder
import org.elasticsearch.common.xcontent.json.JsonXContent
import org.elasticsearch.search.aggregations.InternalAggregations
import org.elasticsearch.search.aggregations.bucket.terms.StringTerms
import org.springframework.transaction.UnexpectedRollbackException

import static org.springframework.http.HttpStatus.*

/**
 * Created by i070219 on 06/11/2016.
 */
trait RenderHelper implements JsonHelper {
    def respondSearchResponse(from, size, Map searchResponse, Closure listRenderer) {
        def output = [
                counts: searchResponse.total,
                from  : from,
                size  : size,
                value : listRenderer.call(searchResponse.searchResults)
        ]
        render output as JSON
    }

    def respondSearchResponse(int from, int size, SearchResponse searchResponse, ArrayList outputList) {
        def output = [
                counts: searchResponse.hits.totalHits,
                from  : from,
                size  : size,
                value : outputList
        ]
        render output as JSON
    }

    def respondSearchResponse(from, size, SearchResponse searchResponse, Closure listRenderer) {
        def output = [
                counts: searchResponse.hits.totalHits,
                from  : from,
                size  : size,
                value : listRenderer.call(searchResponse.hits.hits),
                aggregations: convertAggregations(searchResponse)
        ]
        render output as JSON
    }

    private convertAggregations(SearchResponse searchResponse){
        if(searchResponse.aggregations){
            return toJson(searchResponse.toString()).aggregations
        }else{
            [:]
        }
    }

    def respondList(list, Integer counts) {
        def output = [
                counts: counts,
                value : list
        ]
        render output as JSON
    }

    def responsedCollectionsAsEs(def from, def size, def count, Object[] list, Closure closure){
        def output = [
                counts: count,
                value : closure.call(list),
                from: from,
                size: size,
                aggregations: [:]
        ]
        render output as JSON
    }

    def respondCreated() {
        render view: '/created'
    }

    def respondCreated(Map data) {
        response.status = 201
        render data as JSON
    }

    def respondOK() {
        render status: NO_CONTENT
    }

    def handleNotFoundException(final ResourceNotFoundException exception) {
        setNeedRollback()
        log.error('handling exceptions by handleNotFoundException')
        log.error(exception.message, exception)
        render view: '/notFound', model: [exception: exception]
    }

    def validateFailedException(final ValidationException exception) {
        setNeedRollback()
        log.error('handling exceptions by validateFailedException')
        log.error(exception.message, exception)
        render view: '/badRequest', model: [exception: exception]
    }

    def handleException(final Exception exception) {
        setNeedRollback()
        log.error('handling exceptions by handleException')
        log.error(exception?.message, exception)
        def stackTraceString = ExceptionUtils.getStackTrace(exception)
        log.error(stackTraceString)
        render view: '/error', model: [details: stackTraceString]
    }

    def retry(int retryCount, Closure inputMethod, int currentCount = 1){
        log.debug("Retry count for search: [$currentCount]")
        try{
            inputMethod.call()
        }catch(ResourceNotFoundException ex){
            if(currentCount == retryCount){
                throw new SearchFailedException("Search failed: ["+ex.message+"]")
            }else{
                sleep(500)
                retry(retryCount, inputMethod, ++currentCount)
            }
        }
        log.debug("Retry completed.")
    }

    private void setNeedRollback () {
        def indexServiceProp = "${this.metaClass.hasProperty(this,'indexService')}"
        if(indexServiceProp != "null"){
            indexService.needRollback.set(true)
        }
    }
}