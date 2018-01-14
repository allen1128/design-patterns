package com.org.gof.pattern.flyweight.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * mocking db query
 *
 * */
public class Db {
    public final static List<String> entries = new ArrayList<>();
    public final static Map<String, String[]> combinations = new HashMap<>();

    static {
        entries.add("user1,e1/p1,1");
        entries.add("user2,e1/p1,1");
        entries.add("user2,e2/p2,1");
        entries.add("user3,t1,,2");
        combinations.put("t1", new String[]{"e1/p1", "e2/p2"});
    }
}
