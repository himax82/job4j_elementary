package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00T20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22ToMinus20Then4() {
        double expected = 4.47;
        int x1 = 2;
        int y1 = 2;
        int x2 = -2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus46To1Minus3Then10() {
        double expected = 10.29;
        int x1 = -4;
        int y1 = 6;
        int x2 = 1;
        int y2 = -3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus5Minus5To43Then12() {
        double expected = 12.04;
        int x1 = -5;
        int y1 = -5;
        int x2 = 4;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}