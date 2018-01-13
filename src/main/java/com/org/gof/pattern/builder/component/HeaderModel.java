package com.org.gof.pattern.builder.component;

public class HeaderModel {
    private String headerId;
    private String headerDescription;

    public HeaderModel(String headerId, String headerDescription) {
        this.headerId = headerId;
        this.headerDescription = headerDescription;
    }

    public String getHeaderId() {
        return headerId;
    }

    public void setHeaderd(String headerId) {
        this.headerId = headerId;
    }

    public String getHeaderDescription() {
        return headerDescription;
    }

    public void setHeaderDescription(String headerDescription) {
        this.headerDescription = headerDescription;
    }
}
