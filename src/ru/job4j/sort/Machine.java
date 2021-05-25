package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        if (money < price) {
            throw new RuntimeException("Нищеброды!");
        }

        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int changeTotal = money - price;

        for (int c : coins) {
            while (c <= changeTotal) {
                changeTotal -= c;
                rsl[size++] = c;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}