package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftAr = left.split("\\.");
        String[] rightAr = right.split("\\.");
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(leftAr[i]) != Integer.parseInt(rightAr[i])) {
                return Integer.compare(Integer.parseInt(leftAr[0]), Integer.parseInt(rightAr[0]));
            }
        }
        return left.compareTo(right);
    }
}
