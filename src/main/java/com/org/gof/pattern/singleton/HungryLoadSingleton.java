package com.org.gof.pattern.singleton;

public class HungryLoadSingleton {
    private static HungryLoadSingleton instance = new HungryLoadSingleton();

    private HungryLoadSingleton(){};

    public static HungryLoadSingleton getInstance() {
        return instance;
    }

}
