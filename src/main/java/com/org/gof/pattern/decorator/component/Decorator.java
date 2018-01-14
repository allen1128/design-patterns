package com.org.gof.pattern.decorator.component;

import com.org.gof.pattern.decorator.component.BodyParts;

public abstract class Decorator implements BodyParts {
    protected BodyParts bodyParts;

    public Decorator(BodyParts bodyParts) {
        this.bodyParts = bodyParts;
    }

    public void clean(){
        bodyParts.clean();
    }
}
