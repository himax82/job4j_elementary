package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] matr = new int[size][size];
        for (int i = 1; i <= matr.length ; i++) {
            for (int j = 1; j <= matr.length; j++) {
                matr[i - 1][j - 1] = i * j;
            }
        }
        return matr;
    }

}
