package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (left[i] > right[j]) {
                    int temp = left[i];
                    left[i] = left[j];
                    left[j] = temp;
                }
                else {
                   int temp = right[j];
                    right[j] = right[i];
                    right[i] = temp;
                }
            }
        }
        return rsl;
    }
}


