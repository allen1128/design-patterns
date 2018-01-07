package com.org.gof.pattern.factory;

public class Client {
    public static void main(String[] args){
        FactoryApi factoryApi = new FactoryApiImplB();
        factoryApi.operate("message for factory pattern");
    }
}
