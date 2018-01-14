package com.org.gof.pattern.flyweight;

import com.org.gof.pattern.flyweight.component.Manager;

public class Client {

    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        System.out.println("testing user 1 for e1 and p1: " + manager.contains("user1", "e1", "p1" ));
        System.out.println("testing user 1 for e1 and p2: " + manager.contains("user1", "e1", "p2" ));
        System.out.println("testing user 2 for e1 and p1: " + manager.contains("user2", "e1", "p1" ));
        System.out.println("testing user 2 for e2 and p2: " + manager.contains("user2", "e2", "p2" ));
        System.out.println("testing user 3 for e1 and p1: " + manager.contains("user3", "e1", "p1" ));
        System.out.println("testing user 3 for e2 and p2: " + manager.contains("user3", "e2", "p2" ));
        System.out.println("testing user 4 for e2 and p2: " + manager.contains("user4", "e2", "p2" ));
    }
}

