package com.org.gof.pattern.builder.component;

import java.util.List;

public interface Builder {
    StringBuffer sb = new StringBuffer();
    void buildHeader(HeaderModel headerModel);
    void buildBody(List<BodyModel> bodyModels);
    void buildFooter(FooterModel footerModel);


    /**
     * method to return built result
     */
    default String getResult() {
        return sb.toString();
    }
}
