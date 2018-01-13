package com.org.gof.pattern.chainofresponsiblity.component;

public class RequestModel {
    private String type;

    public RequestModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
