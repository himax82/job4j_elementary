package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("himax@mail.ru", "Pleskov M.U.");
        users.put("himax@gmail.com", "Pleskov R.I");
        users.put("himax@yandex.ru", "Pleskov E.K.");
        for (String k: users.keySet()) {
            String value = users.get(k);
            System.out.println("Email: " + k + " FIO: " + value);
        }
    }
}
