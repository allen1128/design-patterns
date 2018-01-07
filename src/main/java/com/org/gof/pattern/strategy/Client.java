package com.org.gof.pattern.strategy;


import com.org.gof.pattern.strategy.component.Context;
import com.org.gof.pattern.strategy.component.Strategy;
import com.org.gof.pattern.strategy.component.StrategyImplA;
import com.org.gof.pattern.strategy.component.StrategyImplB;

public class Client {
    public static void main(String[] args){
        Strategy strategy = new StrategyImplA();
        Context context = new Context(strategy);
        context.apply();
    }
}
