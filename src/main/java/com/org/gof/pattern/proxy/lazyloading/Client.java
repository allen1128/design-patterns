package com.org.gof.pattern.proxy.lazyloading;

import com.org.gof.pattern.proxy.lazyloading.component.DB;
import com.org.gof.pattern.proxy.lazyloading.component.UserModel;
import com.org.gof.pattern.proxy.lazyloading.component.UserModelProxy;

import java.util.Map;

public class Client {
    public static void main(String[] args){
        DB db = new DB();
        Map<String, String> user = db.getUserById("0002");
        UserModelProxy proxy = new UserModelProxy(new UserModel());

        proxy.setName(user.get("name"));
        proxy.setId(user.get("id"));

        System.out.println("sex: " + proxy.getSex());
        System.out.println("country: " + proxy.getCountry());
    }
}
