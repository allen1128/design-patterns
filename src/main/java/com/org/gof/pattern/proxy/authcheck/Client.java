package com.org.gof.pattern.proxy.authcheck;

import com.org.gof.pattern.proxy.authcheck.component.UserModel;
import com.org.gof.pattern.proxy.authcheck.component.UserModelProxy;
import com.org.gof.pattern.proxy.authcheck.component.DB;

import java.util.Map;

public class Client {
    public static void main(String[] args){
        DB db = new DB();
        Map<String, String> user = db.getUserById("0002");
        UserModelProxy proxy = new UserModelProxy(new UserModel(user.get("name"), user.get("id"), user.get("sex"), user.get("country")));

        proxy.setName("Allen", "noone");
        proxy.setId("0003", "noone");

        proxy.setId("0003", "Ann");
        proxy.setName("Allen", "Ann");
    }
}
