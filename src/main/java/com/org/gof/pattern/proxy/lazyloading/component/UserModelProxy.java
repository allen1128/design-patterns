package com.org.gof.pattern.proxy.lazyloading.component;

import java.util.Map;

public class UserModelProxy implements UserModelApi {
    private UserModel userModel = null;
    private DB db = new DB();

    boolean reloaded;

    public UserModelProxy(UserModel userModel) {
        this.userModel = userModel;
        reloaded = false;
    }

    @Override
    public String getName() {
        return userModel.getName();
    }

    @Override
    public void setName(String name) {
        userModel.setName(name);
    }

    @Override
    public String getId() {
        return userModel.getId();
    }

    @Override
    public void setId(String id) {
        userModel.setId(id);
    }

    @Override
    public String getSex() {
        if (!reloaded) {
            System.out.println("reloading the user model for id: " + userModel.getId());
            reload();
        }
        return userModel.getSex();
    }

    @Override
    public void setSex(String sex) {
        userModel.setSex(sex);
    }

    @Override
    public String getCountry() {
        if (!reloaded) {
            System.out.println("reloading the user model for id: " + userModel.getId());
            reload();
        }
        return userModel.getCountry();
    }

    @Override
    public void setCountry(String country) {
        userModel.setCountry(country);
    }

    private void reload() {
        Map<String, String> user = db.getUserById(userModel.getId());
        userModel = new UserModel(user.get("name"), user.get("id"), user.get("sex"), user.get("country"));
        reloaded = true;
    }
}
