package com.org.gof.pattern.proxy.authcheck.component;

public class UserModel implements UserModelApi {
    String name;
    String id;
    String sex;
    String country;

    public UserModel(String name, String id, String sex, String country) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name, String userName) {
        System.out.format("changed name to %s for %s when you logg in as %s. \n", name, this.getName(), userName);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id, String userName) {
        System.out.format("changed name to %s for %s when you logg in as %s. \n", name, this.getName(), userName);
        this.id = id;
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
