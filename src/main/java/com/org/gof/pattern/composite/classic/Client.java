package com.org.gof.pattern.composite.classic;

import com.org.gof.pattern.composite.classic.component.Component;
import com.org.gof.pattern.composite.classic.component.CompositeComponent;
import com.org.gof.pattern.composite.classic.component.Leaf;

public class Client {
    public static void main(String[] args){
        Component root= new CompositeComponent("factory");
        Component comp1 = new CompositeComponent("manufacture department");
        Component comp2 = new CompositeComponent("warehouse");

        Component leaf1 = new Leaf("machina 1");
        Component leaf2 = new Leaf("machina 2");
        Component leaf3 = new Leaf("machina 3");
        Component leaf4 = new Leaf("machina 4");

        Component leaf5 = new Leaf("depot 1");
        Component leaf6 = new Leaf("depot 2");

        comp1.addChild(leaf1);
        comp1.addChild(leaf2);
        comp1.addChild(leaf3);
        comp1.addChild(leaf4);

        comp2.addChild(leaf5);
        comp2.addChild(leaf6);

        root.addChild(comp1);
        root.addChild(comp2);

        root.print();
    }
}
