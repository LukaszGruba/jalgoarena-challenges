package com.lukgru.jalgoarena.medium;

import java.math.BigInteger;

/**
 * You're given a game board that has m x n squares on it, represented by an m x n array. Write a method countPaths that takes in m and n and returns the number of possible paths from the top left corner to the bottom right corner. Only down and right directions of movement are permitted.
 Examples
 countPaths(m = 2, n = 2) => 2

 as on the following 2x2 Board, the two paths are A->C->D and A->B->D

 A B
 C D
 */
public class CountPaths {

    static BigInteger[] factorials = new BigInteger[50];
    static {
        factorials[0] = BigInteger.ONE;
        for (int i = 1; i < 50; i++) {
            factorials[i] = factorials[i-1].multiply(BigInteger.valueOf(i));
        }
    }

    public int countPaths(int m, int n) {
        if (m == 0 || n == 0) return 0;
        return factorials[m + n - 2].divide(factorials[m-1].multiply(factorials[n-1])).intValue();
    }

}
