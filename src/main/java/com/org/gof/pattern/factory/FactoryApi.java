package com.org.gof.pattern.factory;

import com.org.gof.pattern.factory.component.ProductApi;
import com.org.gof.pattern.factory.component.ProductApiImplB;

public abstract class FactoryApi {
    public void operate(String data){
        ProductApi productApi = factoryMethod();
        productApi.operate(data);
    }

    protected abstract ProductApi factoryMethod();
}
