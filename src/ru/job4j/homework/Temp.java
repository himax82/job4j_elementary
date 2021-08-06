package ru.job4j.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Temp {

    public static int checkData(List<Integer> data) {
        int sum = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) == (data.get(i - 1) + data.get(i + 1)) / 2) {
                sum += data.get(i);
            } else {
                return 0;
            }
        }
        return sum;
    }
}
