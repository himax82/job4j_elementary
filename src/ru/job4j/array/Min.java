package ru.job4j.array;

public class Min {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length - 1; index++) {
           if (array[index] > array[index + 1]) {
               min = array[index + 1];
           }
        }
        return min;
    }

}
