package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort5Elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Elements() {
        int[] data = new int[] {13, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 13};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort10Elements() {
        int[] data = new int[] {13, 4, 8, 1, 3, 5, 12, 6, 2, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 8, 11, 12, 13};
        Assert.assertArrayEquals(expected, result);
    }

}