package com.org.gof.pattern.template.component;

public abstract class Abstract {

    //make sure the method is final so that it cannot be override.
    public final void run() {
        operation1();
        operation2();
        operation3();
    }

    protected void operation1() {
        System.out.println("run default operation1");
    }

    protected abstract void operation2();

    protected abstract void operation3();
}
