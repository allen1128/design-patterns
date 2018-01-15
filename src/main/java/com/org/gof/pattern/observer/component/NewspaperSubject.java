package com.org.gof.pattern.observer.component;


public class NewspaperSubject extends Subject{
    String content;

    public void setContent(String content){
        this.content = content;
        notifyObservers();
    }
}
