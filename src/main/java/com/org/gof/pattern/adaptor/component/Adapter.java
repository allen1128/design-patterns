package com.org.gof.pattern.adaptor.component;

public class Adapter implements Target {
    private Adaptee adaptee = null;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void run() {
        adaptee.execute();
    }
}
