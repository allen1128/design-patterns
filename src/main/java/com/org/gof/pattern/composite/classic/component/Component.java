package com.org.gof.pattern.composite.classic.component;

public abstract class Component {

    private String name;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void addChild(Component component) {
        throw new UnsupportedOperationException("add action not supported");
    }

    public void removeChild(Component component) {
        throw new UnsupportedOperationException("remote action not supported");
    }

    public abstract void print();
}
