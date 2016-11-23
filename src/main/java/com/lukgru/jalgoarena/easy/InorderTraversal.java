package com.lukgru.jalgoarena.easy;

import com.lukgru.jalgoarena.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 Given a binary tree, Write a method inorderTraversal to traverse the tree in the inorder manner. Return array of elements visited in inorder format.
 Example
     1
    / \
   2   3     ==> 4251637
  / \ / \
 4  5 6  7
 */
public class InorderTraversal {

    public int[] inorderTraversal(TreeNode root) {
        if (root == null) return null;
        if (root.right == null && root.left == null) return new int[]{root.data};
        List<Integer> list = new ArrayList<>(7);
        traverse(root, list);
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void traverse(TreeNode node, List<Integer> list) {
        if (node == null) return;
        traverse(node.left, list);
        list.add(node.data);
        traverse(node.right, list);
    }
}
