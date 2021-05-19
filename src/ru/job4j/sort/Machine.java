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
        int currentCoin = 0;

        int changeTotal = money - price;
        while (changeTotal > 0) {
            currentCoin = 0;
            for (int i = 0; i < coins.length; i++) {
                if (coins[i] <= changeTotal) {
                    currentCoin = coins[i];
                    rsl[size++] = currentCoin;
                    break;
                }
            }
            changeTotal -= currentCoin;
        }

        return Arrays.copyOf(rsl, size);
    }
}