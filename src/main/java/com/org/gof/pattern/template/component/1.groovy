package com.sap.sakp.ocdservice

import static org.springframework.http.HttpStatus.*
import grails.converters.JSON
import grails.transaction.Transactional

import org.apache.commons.lang.exception.ExceptionUtils

import com.sap.sakp.ocdservice.exceptions.OcdException

@Transactional(readOnly = true)
class ErrorHandlerController  {
    static responseFormats = ['json', 'xml']

    def error500() {
        def ex = request.exception
        def conType = request.contentType
        def message = ex?.stackTraceLines == null ? ex.cause : ex?.stackTraceLines
        def newMessages = []
        if (message instanceof Collection || message.getClass().isArray()) {
            newMessages = message.collect {
                it.replace("\t", "").replace("\r", "")
            }
        }
        log.error(ExceptionUtils.getFullStackTrace(ex))
        if (conType?.contains("json")) {
            if (ex.cause instanceof OcdException) {
                render status: INTERNAL_SERVER_ERROR, text: ["errorMessage": ex.cause.message] as JSON
                return
            }
            render status: INTERNAL_SERVER_ERROR, text: ["errorMessage": newMessages] as JSON
            return
        }
        render status: INTERNAL_SERVER_ERROR, text: newMessages
    }

    def error500Prod() {
        def ex = request.exception
        log.error(ExceptionUtils.getFullStackTrace(ex))
        if (ex.cause instanceof OcdException) {
            render status: INTERNAL_SERVER_ERROR, text: ex.cause.message
            return
        }
        render status: INTERNAL_SERVER_ERROR, text: "Internal Error."
    }

    def error401() {
        log.error("This request requires HTTP authentication.")
        render status: UNAUTHORIZED, text: ["errorMessage": "This request requires HTTP authentication."] as JSON
    }

}
