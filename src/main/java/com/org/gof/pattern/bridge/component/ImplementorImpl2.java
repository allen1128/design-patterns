package com.org.gof.pattern.bridge.component;

public class ImplementorImpl2 implements Implementor {
    @Override
    public void operator(String data) {
        System.out.format("implmenetor 2 operates on data %s \n", data);
    }
}
