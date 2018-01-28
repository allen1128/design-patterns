package com.org.gof.pattern.composite.noleaf;

import com.org.gof.pattern.composite.noleaf.component.Component;

public class Client {
    public static void main(String[] args){
        Component root= new Component("factory");
        Component comp1 = new Component("manufacture department");
        Component comp2 = new Component("warehouse");

        Component leaf1 = new Component("machina 1");
        Component leaf2 = new Component("machina 2");
        Component leaf3 = new Component("machina 3");
        Component leaf4 = new Component("machina 4");

        Component leaf5 = new Component("depot 1");
        Component leaf6 = new Component("depot 2");

        comp1.addChild(leaf1);
        comp1.addChild(leaf2);
        comp1.addChild(leaf3);
        comp1.addChild(leaf4);

        comp2.addChild(leaf5);
        comp2.addChild(leaf6);

        root.addChild(comp1);
        root.addChild(comp2);

        System.out.println(root);
    }
}
