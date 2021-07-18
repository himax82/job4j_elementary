package ru.job4j.condition;

public class Club {

    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("You can visit the club.");
        } else {
            System.out.println("You can't visit the club.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }

}
