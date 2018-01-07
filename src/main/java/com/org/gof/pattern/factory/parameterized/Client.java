package com.org.gof.pattern.factory.parameterized;

import com.org.gof.pattern.factory.parameterized.component.FactoryOperator;

public class Client {
    public static void main(String [] args){
        FactoryOperator operator = new FactoryOperator();
        operator.operate('B');
    }
}
