package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> list1 = Arrays.asList(o1.split("/"));
        List<String> list2 = Arrays.asList(o2.split("/"));
        Iterator iterator1 = list1.iterator();
        Iterator iterator2 = list2.iterator();
        int i = 0;
        int rsl = 0;
        while (iterator1.hasNext() && iterator2.hasNext()) {
            String el1 = (String) iterator1.next();
            String el2 = (String) iterator2.next();
            if (!el1.equals(el2) && i == 0) {
                rsl = list2.get(i).compareTo(list1.get(i));
            } else {
                rsl = Integer.compare(list1.size(), list2.size());
            }
            if (!el1.equals(el2) && i > 0) {
                rsl = list1.get(i).compareTo(list2.get(i));
            } else {
                rsl = Integer.compare(list1.size(), list2.size());
            }
            i++;
        }
        return rsl;
    }
}

