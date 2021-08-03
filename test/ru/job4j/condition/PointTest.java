package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00T20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22ToMinus20Then4() {
        double expected = 4.47;
        Point a = new Point(2, 2);
        Point b = new Point(-2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus46To1Minus3Then10() {
        double expected = 10.29;
        Point a = new Point(-4, 6);
        Point b = new Point(1, -3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus5Minus5To43Then12() {
        double expected = 12.04;
        Point a = new Point(-5, -5);
        Point b = new Point(4, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when538To610Then8() {
        double expected = 8.30;
        Point a = new Point(5, 3, 8);
        Point b = new Point(6, 1, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus119To4Minus38Then8() {
        double expected = 6.48;
        Point a = new Point(-1, 1, 9);
        Point b = new Point(4, -3, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}