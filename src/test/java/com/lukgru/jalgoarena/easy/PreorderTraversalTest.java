package com.lukgru.jalgoarena.easy;

import com.lukgru.jalgoarena.TreeNode;
import com.lukgru.jalgoarena.TreeNodeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-23.
 */
public class PreorderTraversalTest {

    private PreorderTraversal PreorderTraversal = new PreorderTraversal();

    private TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();

    @Test
    public void test1() {
        //given
        TreeNode root = null;

        //when
        int[] traversal = PreorderTraversal.preorderTraversal(root);

        //then
        assertNull(traversal);
    }

    @Test
    public void test2() {
        //given
        TreeNode root = new TreeNode(1);

        //when
        int[] traversal = PreorderTraversal.preorderTraversal(root);

        //then
        int[] expected = {1};
        assertArrayEquals(expected, traversal);
    }

    @Test
    public void test3() {
        //given
        TreeNode root = treeNodeBuilder.treeNode("1,2,3,4,5,6,7");

        //when
        int[] traversal = PreorderTraversal.preorderTraversal(root);

        //then
        int[] expected = {1,2,4,5,3,6,7};
        assertArrayEquals(expected, traversal);
    }

    @Test
    public void test4() {
        //given
        TreeNode root = treeNodeBuilder.treeNode("1,2,3,4,*,*,7");

        //when
        int[] traversal = PreorderTraversal.preorderTraversal(root);

        //then
        int[] expected = {1,2,4,3,7};
        assertArrayEquals(expected, traversal);
    }
}