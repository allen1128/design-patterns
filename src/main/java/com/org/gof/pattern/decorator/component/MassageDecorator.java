package com.org.gof.pattern.decorator.component;

public class MassageDecorator extends Decorator {
    public MassageDecorator(BodyParts bodyParts) {
        super(bodyParts);
    }

    @Override
    public void clean() {
        System.out.println("messaging");
        bodyParts.clean();
    }
}
