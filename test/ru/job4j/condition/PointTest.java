package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1380To3412Then71Dot16() {
        int x1 = 13;
        int y1 = 80;
        int x2 = 34;
        int y2 = 12;
        double expected = 71.16;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when29To83Then8() {
        int x1 = 2;
        int y1 = 9;
        int x2 = 8;
        int y2 = 3;
        int expected = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.5);
    }

    @Test
    public void when1212To1313Then35() {
        int x1 = -12;
        int y1 = 12;
        int x2 = 13;
        int y2 = -13;
        int expected = 35;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.356);
    }
}