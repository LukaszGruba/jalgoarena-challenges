package com.lukgru.jalgoarena.medium;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Write a method findDuplicates to find the repeated or duplicate elements in an array. This method should return a list of repeated integers in a string with the elements sorted in ascending order.
 Example
 [2,5,7,11,15,11,15] -> '[11, 15]'
 [2,5,7] -> '[]'
 */
public class RepeatedElements {

    public String findDuplicates(int[] arr) {
        int n = arr.length;
        if (arr.length == 0) return "[]";

        Set<Integer> set = new HashSet<Integer>(n);
        Set<Integer> duplicates = new TreeSet<Integer>();

        for (int i=0 ; i<n ; i++) {
            Integer v = arr[i];
            if (set.contains(v)) duplicates.add(v);
            set.add(v);
        }

        StringBuilder s = new StringBuilder("[");
        for (Integer i : duplicates) {
            s.append(i).append(", ");
        }
        if (duplicates.size()>0) {
            return s.substring(0, s.length() - 2) + "]";
        }
        else return "[]";
    }

}
