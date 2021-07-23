package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] matr = new int[size][size];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[i][j] = (i + 1) * (j + 1);
            }
        }
        return matr;
    }

}
