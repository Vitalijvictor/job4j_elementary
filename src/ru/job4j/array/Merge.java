package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int rslPoint = 0;
        int mainIndex = 0;
        while (leftPoint + rightPoint != rsl.length) {
            if (leftPoint != left.length && rightPoint != right.length) {
                rsl[rslPoint++] = left[leftPoint] < right[rightPoint] ? left[leftPoint++] : right[rightPoint++];
            } else if (leftPoint != left.length) {
                rsl[rslPoint++] = left[leftPoint++];
            } else {
                rsl[rslPoint++] = right[rightPoint++];
            }
        }
        return rsl;
    }
}



