package com.org.gof.pattern.flyweight.component;

public class SharedFlyweight implements Flyweight {
    //internal state
    private String property1;
    private String property2;

    public SharedFlyweight(String externalState) {
        String[] properties = externalState.split("/");
        property1 = properties[0];
        property2 = properties[1];
    }

    @Override
    public boolean match(String ep1, String ep2) {
        if (ep1.equals(property1) && ep2.equals(property2)){
            System.out.format("property %s and property %s matched \n", ep1, ep2);
            return true;
        } else {
            System.out.format("property %s and property %s do not match \n", ep1, ep2);
        }

        return false;
    }

    @Override
    public void add(Flyweight f) {
        throw new UnsupportedOperationException("do not support this function");
    }
}
