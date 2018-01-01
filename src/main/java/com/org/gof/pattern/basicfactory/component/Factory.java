package com.org.gof.pattern.basicfactory.component;

public class Factory {
    public static Api create(char c) {
        Api api = null;
        switch (c) {
            case 'A':
                api = new ImplA();
                break;
            case 'B':
                api = new ImplB();
                break;
        }
        return api;
    }
}
