package com.org.gof.pattern.flyweight.component;

public interface Flyweight {
    boolean match(String ep1, String ep2);
    public void add(Flyweight f);
}
