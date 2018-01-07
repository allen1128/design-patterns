package com.org.gof.pattern.factory;

import com.org.gof.pattern.factory.component.ProductApi;
import com.org.gof.pattern.factory.component.ProductApiImplB;

public class FactoryApiImplB extends FactoryApi{
    protected ProductApi factoryMethod() {
        return new ProductApiImplB();
    }
}
