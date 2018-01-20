package com.org.gof.pattern.bridge.component;

public class Abstract {
    Implementor implementor;
    public Abstract(Implementor implementor) {
        this.implementor = implementor;
    }

    public void action(String data){
        implementor.operator(data);
    }
}
