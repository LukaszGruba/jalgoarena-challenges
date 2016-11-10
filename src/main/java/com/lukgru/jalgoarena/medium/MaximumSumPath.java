package com.lukgru.jalgoarena.medium;

import com.lukgru.jalgoarena.TreeNode;

/**
 * Given a binary tree, write a method maxSumPath that returns the maximum sum of data values obtained by traversing nodes along a path between any 2 nodes of the tree. The path must originate and terminate at 2 different nodes of the tree, and the maximum sum is obtained by summing all the data values of the nodes traversed along this path..
 Example
 1
 / \
 2   3     => 18
 / \ / \
 4  5 6  7

 Path: 5 -> 2 -> 1 -> 3 -> 7
 Max Sum = 5+2+1+3+7 = 18

 l:l:l:null r:null r:l:null r:null r:l:l:null r:null r:l:null r:null

 l:null r:null

 l:l:l:null r:null r:null r:l:null r:l:l:null r:null r:null

 null

 l:l:l:l:null r:null r:l:null r:null r:l:null r:null r:l:l:null r:null r:l:null r:null

 l:l:l:null r:null r:l:null r:null r:l:l:null r:null r:l:null r:null

 */
public class MaximumSumPath {

    public int maxSumPath(TreeNode root) {
        return -1;
    }

}
