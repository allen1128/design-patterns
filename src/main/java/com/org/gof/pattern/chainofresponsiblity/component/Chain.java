package com.org.gof.pattern.chainofresponsiblity.component;

public abstract class Chain {
    protected Chain successor = null;

    public Chain getSuccessor() {
        return successor;
    }

    public void setSuccessor(Chain successor) {
        this.successor = successor;
    }

    public abstract void handle(RequestModel requestModel);
}
