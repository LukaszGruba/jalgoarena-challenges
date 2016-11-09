package com.lukgru.jalgoarena.medium;

/**
 * Given an array of integers, write a method maxGain that returns the maximum gain. Maximum Gain is defined as the maximum difference between 2 elements in a list such that the larger element appears after the smaller element. If no gain is possible, return 0.
 Example
 [0,50,10,100,30] -> 100
 */
public class MaxGain {

    public int maxGain(int[] arr) {
        if (arr == null || arr.length <= 1) return 0;
        if (arr.length == 2) {
            int dif = arr[1] - arr[0];
            return dif < 0 ? 0 : dif;
        }

        int[] mins = new int[arr.length];
        int tmpmin = Integer.MAX_VALUE;
        for (int i=0 ; i<arr.length ; i++) {
            tmpmin = Math.min(tmpmin, arr[i]);
            mins[i] = tmpmin;
        }
        int maxDif = 0;
        for (int i=arr.length-1 ; i>=0 ; i--) {
            maxDif = Math.max(maxDif, arr[i] - mins[i]);
        }
        return maxDif;
    }

}
