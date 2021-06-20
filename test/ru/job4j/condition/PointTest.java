
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static java.lang.Math.sqrt;

import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    
    @Test
    public void when10to20then1() {
        int expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    
    @Test
    public void when20to26then6() {
        int expected = 6;
        int x1 = 2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    
    @Test
    public void when42to416then14() {
        int expected = 14;
        int x1 = 4;
        int y1 = 2;
        int x2 = 4;
        int y2 = 16;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenA001AndB111() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(1, 1, 1);
        double dist = a.distance3d(b);
        Assert.assertEquals(sqrt(2), dist, 0.01);
        System.out.println(dist);

    }

    @Test
    public void whenDistance2D() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double dist = a.distance(b);
        Assert.assertEquals(sqrt(2), dist, 0.01);
        System.out.println(dist);

    }
}
