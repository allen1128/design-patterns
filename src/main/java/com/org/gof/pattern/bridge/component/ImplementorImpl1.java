package com.org.gof.pattern.bridge.component;

public class ImplementorImpl1 implements Implementor {
    @Override
    public void operator(String data) {
        System.out.format("implmenetor 1 operates on data %s \n", data);
    }
}
