package ru.job4j.array;

import java.util.Collections;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            Collections.swap(null, data[1], data[i]); 
        }
        return data;
    }
}
