package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int mainIndex = 0;
        for (mainIndex = 0; mainIndex < rsl.length; mainIndex++) {
            rsl[mainIndex++] = left[mainIndex];
            rsl[mainIndex++] = right[mainIndex];
        }

        Arrays.sort(rsl);
        return rsl;
    }
}


