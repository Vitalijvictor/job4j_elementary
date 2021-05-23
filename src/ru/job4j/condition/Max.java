package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
    	return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int tmp = max(a, b);
        return max(tmp, c);
    }

    public static int max(int a, int b, int c, int d) {
        int tmp = max(a, b);
        int tmp1 = max(c, d);
        return max(tmp, tmp1);
    }
}
