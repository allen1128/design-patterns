package com.org.gof.pattern.bridge.component;

public class Impl1 extends Abstract {

    public void specialAction1(){
        System.out.println("enhancing the Abstract class");
    }

    public Impl1(Implementor implementor) {
        super(implementor);
    }

    public void action(String data){
        data = "special logic 1 for " + data;
        super.action(data);
    }
}
