package com.org.gof.pattern.proxy.lazyloading.component;

public class UserModel {
    String name;
    String id;
    String sex;
    String country;

    public UserModel() {
    }

    public UserModel(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public UserModel(String name, String id, String sex, String country) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
