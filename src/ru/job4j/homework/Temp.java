package ru.job4j.homework;

import java.util.*;

public class Temp {

    public static int sumLegs(Map<Animal, Integer> data) {
        int sum = 0;
        for (Animal a : data.keySet()) {
            sum += a.getLegs() * data.get(a);
        }
        return sum;
    }

    public static class Animal {
        private String name;

        private int legs;

        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        public String getName() {
            return name;
        }

        public int getLegs() {
            return legs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
