package com.org.gof.pattern.bridge;

import com.org.gof.pattern.bridge.component.Impl1;
import com.org.gof.pattern.bridge.component.Impl2;
import com.org.gof.pattern.bridge.component.ImplementorImpl1;
import com.org.gof.pattern.bridge.component.ImplementorImpl2;


public class Client {
    public static void main(String[] args){
        Impl1 impl1 = new Impl1(new ImplementorImpl1());
        impl1.action("some data");

        Impl2 impl2 = new Impl2(new ImplementorImpl2());
        impl2.action("other data");
    }
}
