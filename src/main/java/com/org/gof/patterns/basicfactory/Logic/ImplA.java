package com.org.gof.patterns.basicfactory.Logic;

public class ImplA implements Api {
    public void operate(String name) {
        System.out.format("operating %s in ImplA", name);
    }
}
