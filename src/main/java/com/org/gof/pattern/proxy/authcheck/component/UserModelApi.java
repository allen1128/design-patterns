package com.org.gof.pattern.proxy.authcheck.component;

public interface UserModelApi {

    public String getName();

    public void setName(String name, String userName);

    public String getId();

    public void setId(String id, String userId);

    public String getSex();

    public void setSex(String sex);

    public String getCountry();

    public void setCountry(String country);
}
