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
 */
public class MaximumSumPath {

    private int maxPath;

    public int maxSumPath(TreeNode root) {
        if (root == null) return 0;
        maxPath = Integer.MIN_VALUE;
        return Math.max(traverse(root), maxPath);
    }

    private int traverse(TreeNode node) {
        if (node.left == null && node.right == null) return node.data;
        int left = node.left != null ? traverse(node.left) : 0;
        int right = node.right != null ? traverse(node.right) : 0;
        maxPath = Math.max(maxPath, left + right + node.data);
        return Math.max(left, right) + node.data;
    }

}
