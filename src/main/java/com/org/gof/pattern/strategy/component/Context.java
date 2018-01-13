package com.org.gof.pattern.strategy.component;

public class Context implements Cloneable{
    Strategy strategy = null;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void apply(){
        this.strategy.run();
    }
}
