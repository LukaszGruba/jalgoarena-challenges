package com.lukgru.jalgoarena.medium;

/**
 * Given an integer array containing the available denominations of coins in descending order, write a method makeChange to compute the number of possible ways of representing a monetary amount in cents. For simplicity, assume that there are an infinite number of coins available for each coin denomination in the array.
 Example
 [25,10,5,1], 10 -> 4
 */
public class MakeChange {

    public int makeChange(int[] coins, int amount) {
        if (amount <=0 || coins.length == 0) return 0;

        int[][] solution = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            solution[i][0] = 1;
        }
        for (int i = 1; i <= amount; i++) {
            solution[0][i] = 0;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    solution[i][j] = solution[i - 1][j] + solution[i][j - coins[i - 1]];
                } else {
                    solution[i][j] = solution[i - 1][j];
                }
            }
        }
        return solution[coins.length][amount];
    }

}
