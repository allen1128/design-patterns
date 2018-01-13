package com.org.gof.pattern.strategy.component;

public class Context {
    Strategy strategy = null;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void apply(){
        this.strategy.run();
    }
}
