package com.lukgru.jalgoarena.easy;

import com.lukgru.jalgoarena.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 Given a binary tree, Write a method preorderTraversal to traverse the tree in the preorder manner. Return array of elements visited in preorder format.
 Example
 1
 / \
 2   3     ==> 1245367
 / \ / \
 4  5 6  7
 */
public class PreorderTraversal {

    public int[] preorderTraversal(TreeNode root) {
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
        list.add(node.data);
        traverse(node.left, list);
        traverse(node.right, list);
    }
}
