package com.org.gof.pattern.decorator.component;

public class FaceliftDecorator extends Decorator {
    public FaceliftDecorator(BodyParts bodyParts) {
        super(bodyParts);
    }

    @Override
    public void clean() {
        System.out.println("face lifting");
        bodyParts.clean();
    }
}
