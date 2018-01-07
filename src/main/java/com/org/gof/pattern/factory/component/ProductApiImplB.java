package com.org.gof.pattern.factory.component;

public class ProductApiImplB implements ProductApi {
    public void operate(String data) {
        System.out.format("Operating in Product B with data %s", data);
    }
}
