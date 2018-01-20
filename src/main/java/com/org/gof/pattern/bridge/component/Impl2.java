package com.org.gof.pattern.bridge.component;

public class Impl2 extends Abstract {
    public void specialAction2(){

    }

    public Impl2(Implementor implementor) {
        super(implementor);
    }

    public void action(String data){
        data = "special logic 2 for " + data;
        implementor.operator(data);
    }
}
