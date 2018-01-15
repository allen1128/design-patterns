package com.org.gof.pattern.observer.component;

public class NewsPaperReader implements Observer {
    String name;

    public NewsPaperReader(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        NewspaperSubject newspaper = (NewspaperSubject) subject;
        System.out.format("name %s has received subject %s \n", name, newspaper.content);
    }
}
