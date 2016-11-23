package com.lukgru.jalgoarena.easy;

import java.util.Arrays;

/**
 * Single Number  Problem Ranking
 Write a method singleNumber that returns a number that appears only once in an array. Assume that array will surely have a unique value. The array will never be empty..
 Examples
 [1,2,3,4,1,2,3,4,5]
 ->
 5

 [1,2,3,4,3,-2,4,5,1,2,3,4,5,]
 [0,1,2,3,4,5,1,2,3,4,5,]
 [1,]
 [1,2,3,4,1,2,3,4,5,]
 */
public class SingleNumber {
    public int singleNumber(int[] arr) {
        if(arr.length == 1) return arr[0];
        Arrays.sort(arr);
        for (int i=0 ; i<arr.length-1 ; i=i+2)  {
            if (arr[i] != arr[i+1]) return arr[i];
        }
        return arr[arr.length - 1];
    }
}
