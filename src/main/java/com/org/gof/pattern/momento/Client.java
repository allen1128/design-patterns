package com.org.gof.pattern.momento;

import com.org.gof.pattern.momento.component.Momentor;
import com.org.gof.pattern.momento.component.MomentorManager;
import com.org.gof.pattern.momento.component.Originator;

public class Client {
    public static void main(String args[]) {
        Originator originator = new Originator(0);
        originator.add(5);

        Momentor momentor = originator.createMomento();
        MomentorManager momentorManager = new MomentorManager();
        momentorManager.save(momentor);

        originator.minus(10);
        originator.print();

        originator.setMomentor(momentorManager.retrieve());
        originator.print();

        originator.add(10);
        originator.print();
    }
}
