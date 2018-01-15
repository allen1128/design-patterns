package com.org.gof.pattern.observer.component;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observerList = new ArrayList<>();

    protected void notifyObservers(){
        observerList.stream().forEach( observer -> {
            observer.update(this);
        });
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void deattach(Observer observer) {
        observerList.remove(observer);
    }
}
