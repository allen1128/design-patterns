package com.org.gof.pattern.singleton;


public class LazyInitializationHolderSingleton {

    /*
       lazy initialization holder class
     */
    public static class SingletonHolder{
        private static LazyInitializationHolderSingleton instance = new LazyInitializationHolderSingleton();
    }

    private LazyInitializationHolderSingleton(){};

    public static LazyInitializationHolderSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
