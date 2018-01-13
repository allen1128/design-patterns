package com.org.gof.pattern.builder.component;

public class BodyModel {
    private String subjecId;
    private String name;
    private String description;

    public BodyModel(String subjecId, String name, String description) {
        this.subjecId = subjecId;
        this.name = name;
        this.description = description;
    }

    public String getSubjecId() {
        return subjecId;
    }

    public void setSubjecId(String subjecId) {
        this.subjecId = subjecId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
