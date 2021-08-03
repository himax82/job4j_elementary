package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxThen40() {
        int i1 = 40;
        int i2 = 39;
        int i3 = 40;
        int result = Max.max(i1, i2, i3);
        int expected = 40;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxThen10() {
        int i1 = 2;
        int i2 = 10;
        int i3 = 5;
        int i4 = 1;
        int result = Max.max(i1, i2, i3, i4);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

}