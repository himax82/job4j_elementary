package ru.job4j.homework;

import java.util.Arrays;

    public class Salary {

        public static int[] or(int[] left, int[] right) {
            int[] temp = new int[left.length + right.length];
            int[] s = new int[left.length + right.length];
            int count = 0;
            int l = 0;
            for (int i = 0; i < left.length; i++) {
                    temp[l++] = left[i];
                }
                for (int i = 0; i < right.length; i++) {
                    temp[l++] = right[i];
                }
                if (left.length == 0 || right.length == 0) {
                    return temp;
                }

            s[count] = temp[0];
                for (int i = 1; i < temp.length; i++) {
                    boolean check = false;
                    for (int j = 0; j < count + 1; j++) {
                        if (s[j] != temp[i]) {
                            check = true;
                        } else {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        s[++count] = temp[i];
                    }
                }
                return Arrays.copyOf(s, count + 1);
        }

}
