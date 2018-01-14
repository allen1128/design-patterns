package com.org.gof.pattern.decorator.component;

public class FaceLotionDecorator extends Decorator {
    public FaceLotionDecorator(BodyParts bodyParts) {
        super(bodyParts);
    }

    @Override
    public void clean() {
        System.out.println("applying lotion");
        bodyParts.clean();
    }
}
