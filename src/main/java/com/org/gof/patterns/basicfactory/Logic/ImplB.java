package com.org.gof.patterns.basicfactory.Logic;

public class ImplB implements Api{
    public void operate(String name) {
        System.out.format("operating %s in ImplB", name);
    }
}
