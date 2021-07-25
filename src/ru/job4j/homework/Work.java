package ru.job4j.homework;

public class Work {

    public static void push(int[][] array, int row, int column) {
        int temp1 = array[row][column];
        int temp2 = 0;
        for (int k = 1; k < array.length - column; k++) {
                    if (k == array.length - column - 1) {
                        array[row][column + k] = temp1;
                        break;
                    }
                    temp2 = array[row][column + k];
                    array[row][column + k] = temp1;
                    temp1 = temp2;
                }
        temp1 = array[row][column];
        for (int k = 1; k <= column; k++) {
            if (k == array.length - column - 1) {
                array[row][column - k] = temp1;
                break;
            }
            temp2 = array[row][column - k];
            array[row][column - k] = temp1;
            temp1 = temp2;
        }
        temp1 = array[row][column];
        for (int k = 1; k <= row; k++) {
            if (k == array.length - row - 1) {
                array[row - k][column] = temp1;
                break;
            }
            temp2 = array[row - k][column];
            array[row - k][column] = temp1;
            temp1 = temp2;
        }
        temp1 = array[row][column];
        for (int k = 1; k < array.length - row; k++) {
            if (k == array.length - row - 1) {
                array[row + k][column] = temp1;
                break;
            }
            temp2 = array[row + k][column];
            array[row + k][column] = temp1;
            temp1 = temp2;
        }
        array[row][column] = 0;
            }
        }
