package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Albert Einstein";
        names[1] = "Lev Davidovich Landau";
        names[2] = "Nikola Tesla";
        names[3] = "James Clerk Maxwell";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
