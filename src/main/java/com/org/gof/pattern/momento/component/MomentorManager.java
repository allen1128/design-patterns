package com.org.gof.pattern.momento.component;

public class MomentorManager {
    Momentor momentor;

    public void save(Momentor momentor) {
        this.momentor = momentor;
    }

    public Momentor retrieve() {
        return momentor;
    }
}
