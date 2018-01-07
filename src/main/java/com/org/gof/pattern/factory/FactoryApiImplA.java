package com.org.gof.pattern.factory;

import com.org.gof.pattern.factory.component.ProductApi;
import com.org.gof.pattern.factory.component.ProductApiImplA;

public class FactoryApiImplA extends FactoryApi {
    protected ProductApi factoryMethod() {
        return new ProductApiImplA();
    }
}
