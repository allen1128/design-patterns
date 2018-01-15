package com.org.gof.pattern.observer;

import com.org.gof.pattern.observer.component.MegazineReader;
import com.org.gof.pattern.observer.component.MegazineSubject;
import com.org.gof.pattern.observer.component.NewsPaperReader;
import com.org.gof.pattern.observer.component.NewspaperSubject;
import com.org.gof.pattern.observer.component.Observer;

public class Client {
    public static void main(String[] args) {
        NewspaperSubject newspaper = new NewspaperSubject();
        Observer tom = new NewsPaperReader("Tom");
        Observer jack = new NewsPaperReader("Jack");
        newspaper.attach(tom);
        newspaper.attach(jack);
        newspaper.setContent("Donald Trump Elected to be President of the United States");
        newspaper.deattach(tom);
        newspaper.setContent("Donald Trump Built Walls");

        MegazineSubject megazine = new MegazineSubject();
        java.util.Observer ann = new MegazineReader("ann");
        java.util.Observer jane = new MegazineReader("jane");
        megazine.addObserver(ann);
        megazine.addObserver(jane);
        megazine.setContent("times has come");
        megazine.deleteObserver(ann);
        megazine.setContent("time is gone");
    }
}


