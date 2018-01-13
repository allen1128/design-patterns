package com.org.gof.pattern.builder.component;

import java.util.List;

public class Director {
    Builder builder = null;
    public Director(Builder builder){
        this.builder = builder;
    }

    /*
        note here the contructor doesn't return construction result
     */
    public void construct(HeaderModel headerModel, List<BodyModel> bodyModels, FooterModel footerModel){
        builder.buildHeader(headerModel);
        builder.buildBody(bodyModels);
        builder.buildFooter(footerModel);
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
