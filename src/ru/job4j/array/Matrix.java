  
package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
        	array[i][i] = (i) * (i + 1);            
        }
        return array;
    }
}
