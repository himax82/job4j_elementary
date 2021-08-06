package ru.job4j.homework;

import java.util.*;

public class Temp {

    public static boolean checkString(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : chars) {
            set.add(ch);
        }
        return set.size() == chars.length;
    }
}
