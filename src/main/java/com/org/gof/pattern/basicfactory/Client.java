package com.org.gof.pattern.basicfactory;

import com.org.gof.pattern.basicfactory.component.Api;
import com.org.gof.pattern.basicfactory.component.Factory;

public class Client {
    public static void main(String[] args){
        //the client; however, knows some details about the factory
        Api api = Factory.create('A');
        if (api != null){
            api.operate("alpha");
        }
    }
}
