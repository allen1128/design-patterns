package com.org.gof.pattern.flyweight.component;

public class Manager {
    private final static Manager instance = new Manager();

    private Manager() {
    }

    public static Manager getInstance() {
        return instance;
    }

    public boolean contains(String user, String e, String p) {
        for (String entry : Db.entries) {
            Flyweight flyweight = null;
            String[] properties = entry.split(",");
            if (properties[0].equals(user)) {
                flyweight = queryForFlyweight(properties[1], properties[2].equals("1"));

                if (flyweight.match(e, p)) {
                    return true;
                }
            }
        }

        return false;
    }

    private Flyweight queryForFlyweight(String key, boolean shared) {
        Flyweight flyweight = null;
        if (!shared) {
            flyweight = new UnsharedFlyweight();
            for (String key1: Db.combinations.get(key)) {
                flyweight.add(FlyweightFactory.getInstance().getFlyweight(key1));
            }
        } else {
            flyweight = FlyweightFactory.getInstance().getFlyweight(key);
        }
        return flyweight;
    }
}
