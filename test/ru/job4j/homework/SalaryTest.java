package ru.job4j.homework;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SalaryTest {

    @Test
    public void test() {
        assertArrayEquals(new int[]{}, Salary.or(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{1}, Salary.or(new int[]{1}, new int[]{}));
        assertArrayEquals(new int[]{1}, Salary.or(new int[]{}, new int[]{1}));
        assertArrayEquals(new int[]{1, 2}, Salary.or(new int[]{1, 2}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, Salary.or(new int[]{1, 2}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, Salary.or(new int[]{1}, new int[]{2, 3}));

    }
}