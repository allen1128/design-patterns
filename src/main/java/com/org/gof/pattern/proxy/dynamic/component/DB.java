package com.org.gof.pattern.proxy.dynamic.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DB {
    private List<Map<String, String>> users = new ArrayList<>();

    public DB(){
        initDB();
    }

    private void initDB() {
        Map<String, String> user1 = new HashMap<>();
        user1.put("name", "John");
        user1.put("id", "0001");
        user1.put("sex", "M");
        user1.put("country", "China");

        Map<String, String> user2 = new HashMap<>();
        user1.put("name", "Ann");
        user1.put("id", "0002");
        user1.put("sex", "F");
        user1.put("country", "Canada");


        users.add(user1);
        users.add(user2);
    }

    public Map<String, String> getUserById(String id) {
        Map<String, String> result = null;
        for (Map<String, String> user : users) {
            if (id.equals(user.get("id"))) {
                result = user;
                break;
            }
        }

        return result;
    }
}
