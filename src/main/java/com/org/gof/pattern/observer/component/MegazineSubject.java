package com.org.gof.pattern.observer.component;


import java.util.Observable;

public class MegazineSubject extends Observable {
    String content;

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers();
    }
}
