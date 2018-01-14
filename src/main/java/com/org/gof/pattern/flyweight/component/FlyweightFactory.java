package com.org.gof.pattern.flyweight.component;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final static FlyweightFactory instance = new FlyweightFactory();

    private Map<String, Flyweight> flyweights = new HashMap<>();

    public static FlyweightFactory getInstance(){
        return instance;
    }

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if (flyweight == null){
            flyweight = new SharedFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }



}
