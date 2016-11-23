package com.lukgru.jalgoarena.easy;

import com.lukgru.jalgoarena.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Łukasz on 2016-11-23.
 */
public class PostorderTraversal {

    public int[] postorderTraversal(TreeNode root) {
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
