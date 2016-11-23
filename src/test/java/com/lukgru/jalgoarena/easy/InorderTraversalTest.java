package com.lukgru.jalgoarena.easy;

import com.lukgru.jalgoarena.TreeNode;
import com.lukgru.jalgoarena.TreeNodeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class InorderTraversalTest {

    private InorderTraversal inorderTraversal = new InorderTraversal();

    private TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();

    @Test
    public void test1() {
        //given
        TreeNode root = null;

        //when
        int[] traversal = inorderTraversal.inorderTraversal(root);

        //then
        assertNull(traversal);
    }

    @Test
    public void test2() {
        //given
        TreeNode root = new TreeNode(1);

        //when
        int[] traversal = inorderTraversal.inorderTraversal(root);

        //then
        int[] expected = {1};
        assertArrayEquals(expected, traversal);
    }

    @Test
    public void test3() {
        //given
        TreeNode root = treeNodeBuilder.treeNode("1,2,3,4,5,6,7");

        //when
        int[] traversal = inorderTraversal.inorderTraversal(root);

        //then
        int[] expected = {4,2,5,1,6,3,7};
        assertArrayEquals(expected, traversal);
    }

    @Test
    public void test4() {
        //given
        TreeNode root = treeNodeBuilder.treeNode("1,2,3,4,*,*,7");

        //when
        int[] traversal = inorderTraversal.inorderTraversal(root);

        //then
        int[] expected = {4,2,1,3,7};
        assertArrayEquals(expected, traversal);
    }
}