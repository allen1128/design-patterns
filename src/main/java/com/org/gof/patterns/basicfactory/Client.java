package com.org.gof.patterns.basicfactory;

import com.org.gof.patterns.basicfactory.Logic.Api;
import com.org.gof.patterns.basicfactory.Logic.Factory;

public class Client {
    public static void main(String[] args){
        Api api = Factory.create('A');
        if (api != null){
            api.operate("alpha");
        }
    }
}
