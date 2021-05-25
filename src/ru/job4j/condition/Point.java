package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2));
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