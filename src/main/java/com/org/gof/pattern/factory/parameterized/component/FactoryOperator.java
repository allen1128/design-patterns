package com.org.gof.pattern.factory.parameterized.component;

public class FactoryOperator {
    public void operate(char type){
        ProductApi productApi = getProductApi(type);
        productApi.operate();
    }

    private ProductApi getProductApi(char type) {
        ProductApi api = null;
        switch (type) {
            case 'A':
                api = new ProductA();
                break;
            case 'B':
                api = new ProductB();
                break;
        }

        return api;
    }
}
