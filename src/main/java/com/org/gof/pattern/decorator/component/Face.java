package com.org.gof.pattern.decorator.component;

public class Face implements BodyParts {
    @Override
    public void clean() {
        System.out.println("wash face");
    }
}
