package ru.job4j.homework;

import java.util.Arrays;

    public class Salary {
        public static int[][] found(int[] data, int up, int down) {
            int[][] result = new int[data.length][];
            int[] temp = new int[2];
            int j = 0;
            int count = 0;
            for (int i = 0; i < data.length; i++) {
                while (data[i] >= up || data[i] <= down) {
                    temp[j++] = i;
                    break;
                }
                if (j  == 2) {
                    result[count++] = temp;
                    j = 0;
                    temp = new int[2];
                }
            }
            if (j == 1 && count == 0) {
                temp[1] = temp[0];
                result[0] = temp;
                count++;
            }
            return Arrays.copyOf(result, count);
        }

        public static void main(String[] args) {
            int[] data = {5, 16, 17, 15, 10, 1, 2};
            int[][] rsl = found(data, 16, 4);
            for (int i = 0; i < rsl.length; i++) {
                for (int j = 0; j < rsl[i].length; j++) {
                    int temp = rsl[i][j];
                    System.out.print(temp + " ");
                }
                System.out.println();
            }
        }

}
