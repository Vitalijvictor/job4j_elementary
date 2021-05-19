package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int mainIndex = 0;

        for (int j = 0; j < left.length; j++) {
            rsl[mainIndex++] = left[j];
        }
        for (int i = 0; i < right.length; i++) {
            rsl[mainIndex++] = right[i];
        }

        Arrays.sort(rsl);
        return rsl;
    }
}


