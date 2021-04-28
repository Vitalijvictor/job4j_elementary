package condition;

import java.lang.Math;





public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double c = Math.pow(a, 2);
        double d = Math.pow(b, 2);
        double e = c + d;
        double f = Math.sqrt(e);
        double rsl = f;
        return rsl;
        
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
    
    
}