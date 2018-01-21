package com.org.gof.pattern.template.component;

public class Impl2 extends Abstract {
    public void operation1(){
        System.out.println("overriding default implementation of operation1");
    }

    @Override
    protected void operation2() {
        System.out.println("run operation 2 on impl2");
    }

    @Override
    protected void operation3() {
        System.out.println("run operation 3 on impl2");
    }
}
