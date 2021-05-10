package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = 0; i < finish; i++) {
        	if (min > array[finish]) {
        		min = array[finish];
        	}
        } 
        return min;
    }
}

