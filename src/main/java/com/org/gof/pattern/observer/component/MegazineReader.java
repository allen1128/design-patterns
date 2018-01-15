package com.org.gof.pattern.observer.component;

import java.util.Observable;
import java.util.Observer;

public class MegazineReader implements Observer {
    String name;

    public MegazineReader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        MegazineSubject subject = (MegazineSubject) o;
        System.out.format("name %s has received subject %s \n", name, subject.content);
    }
}
