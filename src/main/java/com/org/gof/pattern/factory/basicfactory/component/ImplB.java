package com.org.gof.pattern.factory.basicfactory.component;

public class ImplB implements Api{
    public void operate(String name) {
        System.out.format("operating %s in ImplB", name);
    }
}
