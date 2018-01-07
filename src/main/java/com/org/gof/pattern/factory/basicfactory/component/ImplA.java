package com.org.gof.pattern.factory.basicfactory.component;

public class ImplA implements Api {
    public void operate(String name) {
        System.out.format("operating %s in ImplA", name);
    }
}
