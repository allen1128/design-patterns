package com.org.gof.patterns.basicfactory.Logic;

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
