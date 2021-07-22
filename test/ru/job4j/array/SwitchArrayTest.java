package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {2, 8, 5, 4, 12};
        int source = 1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 12, 5, 4, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to0() {
        int[] input = {2, 8, 5, 4, 12};
        int source = 2;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 8, 2, 4, 12};
        Assert.assertArrayEquals(expected, result);
    }

}