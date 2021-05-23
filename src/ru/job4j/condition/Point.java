package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
















/*
package ru.job4j.condition;
import java.lang.Math;


public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
    	double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }
    
    public static void main(String[] args) {
        double result = Point.distance(4, 2, 4, 16);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }   
}
*/