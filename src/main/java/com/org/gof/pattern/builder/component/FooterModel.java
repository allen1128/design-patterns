package com.org.gof.pattern.builder.component;

public class FooterModel {
    private String footerId;
    private String footerDescription;

    public FooterModel(String footerId, String footerDescription) {
        this.footerId = footerId;
        this.footerDescription = footerDescription;
    }

    public String getFooterId() {
        return footerId;
    }

    public void setFooterId(String footerId) {
        this.footerId = footerId;
    }

    public String getFooterDescription() {
        return footerDescription;
    }

    public void setFooterDescription(String footerDescription) {
        this.footerDescription = footerDescription;
    }
}
