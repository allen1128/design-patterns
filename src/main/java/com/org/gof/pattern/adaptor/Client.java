package com.org.gof.pattern.adaptor;

import com.org.gof.pattern.adaptor.component.Adaptee;
import com.org.gof.pattern.adaptor.component.Adapter;
import com.org.gof.pattern.adaptor.component.Target;

public class Client {
    public static void main(String[] args){
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.run();
    }
}
