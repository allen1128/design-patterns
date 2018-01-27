package com.org.gof.pattern.proxy.authcheck.component;

import java.util.Map;

public class UserModelProxy implements UserModelApi {
    private UserModel userModel = null;
    private DB db = new DB();

    boolean reloaded;

    public UserModelProxy(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public String getName() {
        return userModel.getName();
    }

    @Override
    public void setName(String name, String userName) {
        if (!userName.equals(userModel.getName())) {
            System.out.format("forbidden to change name for %s when you logg in as %s. \n", userModel.getName(), userName);
            return;
        }

        userModel.setName(name, userName);
    }

    @Override
    public String getId() {
        return userModel.getId();
    }

    @Override
    public void setId(String id, String userName) {
        if (!userName.equals(userModel.getName())) {
            System.out.format("forbidden to change id for %s when you logg in as %s. \n", userModel.getName(), userName);
            return;
        }

        userModel.setId(id, userName);
    }

    @Override
    public String getSex() {
        return userModel.getSex();
    }

    @Override
    public void setSex(String sex) {
        userModel.setSex(sex);
    }

    @Override
    public String getCountry() {
        return userModel.getCountry();
    }

    @Override
    public void setCountry(String country) {
        userModel.setCountry(country);
    }
}
