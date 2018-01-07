package com.org.gof.pattern.factory.component;

public class ProductApiImplA implements ProductApi {
    public void operate(String data) {
        System.out.format("Operating in Product A with data %s", data);
    }
}
