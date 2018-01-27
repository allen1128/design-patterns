package com.org.gof.pattern.proxy.dynamic;

import com.org.gof.pattern.proxy.authcheck.component.DB;
import com.org.gof.pattern.proxy.dynamic.component.UserModel;
import com.org.gof.pattern.proxy.dynamic.component.UserModelApi;
import com.org.gof.pattern.proxy.dynamic.component.UserModelProxy;

import java.util.Map;

public class Client {
    public static void main(String[] args){
        DB db = new DB();
        Map<String, String> user = db.getUserById("0002");
        UserModel userModel = new UserModel(user.get("name"), user.get("id"), user.get("sex"), user.get("country"));

        UserModelProxy userModelProxy = new UserModelProxy();
        UserModelApi userModelApi = userModelProxy.getProxyInterface(userModel);

        userModelApi.setName("Allen", "noone");
        userModelApi.setId("0003", "noone");

        userModelApi.setId("0003", "Ann");
        userModelApi.setName("Allen", "Ann");
    }
}
