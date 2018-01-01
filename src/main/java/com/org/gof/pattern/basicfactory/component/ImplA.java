package com.org.gof.pattern.basicfactory.component;

public class ImplA implements Api {
    public void operate(String name) {
        System.out.format("operating %s in ImplA", name);
    }
}
