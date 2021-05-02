package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("hgonzalez@gmail.com", "Hugo Gonzalez");
        users.put("ghernandez@gmail.com", "Guillermo Hernandez");
        users.put("dlopez@gmail.com", "Daniel Lopez");
        for (Map.Entry<String, String> index: users.entrySet()) {
            String key = index.getKey();
            String value = index.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
