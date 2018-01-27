package com.org.gof.pattern.proxy.dynamic.component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserModelProxy implements InvocationHandler {
    private UserModel userModel;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName() == "setName" || method.getName() == "setId") {
            if (userModel.getName() != null && userModel.getName().equals(args[1])){
                return method.invoke(userModel, args);
            } else {
                System.out.format("forbidden to change name for %s when you logg in as %s. \n", userModel.getName(), args[1]);
            }
        } else {
            return method.invoke(userModel, args);
        }

        return null;
    }

    public UserModelApi getProxyInterface(UserModel userModel){
        this.userModel = userModel;
        UserModelApi userModelApi = (UserModelApi) Proxy.newProxyInstance(
                userModel.getClass().getClassLoader(),
                userModel.getClass().getInterfaces(),
                this
        );
        return userModelApi;
    }
}
