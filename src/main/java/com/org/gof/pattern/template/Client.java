package com.org.gof.pattern.template;

import com.org.gof.pattern.template.component.Impl1;
import com.org.gof.pattern.template.component.Impl2;

public class Client {
    public static void main(String[] args) {
        Impl1 impl1 = new Impl1();
        impl1.run();

        Impl2 impl2 = new Impl2();
        impl2.run();
    }
}
