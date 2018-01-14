package com.org.gof.pattern.flyweight.component;

import java.util.ArrayList;
import java.util.List;

public class UnsharedFlyweight implements Flyweight {
    List<Flyweight> flyweightList = new ArrayList<>();

    @Override
    public boolean match(String ep1, String ep2) {
        return null != flyweightList.stream().filter(flyweight -> {
            return flyweight.match(ep1, ep2);
        });
    }

    @Override
    public void add(Flyweight f) {
        flyweightList.add(f);
    }
}
