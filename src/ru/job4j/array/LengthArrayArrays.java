package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{2}, {4, 6}, {1, 3, 9}, {5, 8, 10, 7}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }

}
