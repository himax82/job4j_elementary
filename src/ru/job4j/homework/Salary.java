package ru.job4j.homework;

public class Salary {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int n = 0;
        int m = 0;
        int e = 0;
        while (n < rsl.length) {
            if (m == left.length) {
                rsl[n] = right[e];
                n++;
                e++;
            }
            one:
            while (m < left.length) {
                while (e < right.length) {
                    if (left[m] <= right[e]) {
                        rsl[n] = left[m];
                        n++;
                        m++;
                        break one;
                    } else {
                        rsl[n] = right[e];
                        n++;
                        e++;
                        break one;
                    }
                }
                rsl[n] = left[m];
                n++;
                m++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        int[] res = merge(a, b);
        for (int re : res) {
            System.out.println(re);
        }

    }
}
