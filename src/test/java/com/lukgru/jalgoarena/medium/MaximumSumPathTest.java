package com.lukgru.jalgoarena.medium;

import com.lukgru.jalgoarena.TreeNode;
import com.lukgru.jalgoarena.TreeNodeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-20.
 */
public class MaximumSumPathTest {

    private MaximumSumPath maximumSumPath = new MaximumSumPath();

    @Test
    public void givenNullTreeReturnZero() {
        //given
        TreeNode root = null;

        //when
        int maxSumPath = maximumSumPath.maxSumPath(root);

        //then
        int expected = 0;
        assertEquals(expected, maxSumPath);
    }

    @Test
    public void givenOneNodeReturnItsValue() {
        //given
        TreeNode root = new TreeNode(1);

        //when
        int maxSumPath = maximumSumPath.maxSumPath(root);

        //then
        int expected = 1;
        assertEquals(expected, maxSumPath);
    }

    @Test
    public void givenFullTree() {
        //given
        TreeNode root = new TreeNodeBuilder().treeNode("1,2,3,4,5,6,7");

        //when
        int maxSumPath = maximumSumPath.maxSumPath(root);

        //then
        int expected = 18;
        assertEquals(expected, maxSumPath);
    }

    @Test
    public void givenFullTreeWithNegativeNodes() {
        //given
        TreeNode root = new TreeNodeBuilder().treeNode("1,2,3,4,-5,6,-7");

        //when
        int maxSumPath = maximumSumPath.maxSumPath(root);

        //then
        int expected = 16;
        assertEquals(expected, maxSumPath);
    }

    @Test
    public void givenTreeWithFourLevels() {
        //given
        TreeNode root = new TreeNodeBuilder().treeNode("1,2,3,4,5,6,7,8,9");

        //when
        int maxSumPath = maximumSumPath.maxSumPath(root);

        //then
        int expected = 26;
        assertEquals(expected, maxSumPath);
    }

    @Test
    public void givenTreeWithOnlyOnePathReturnSumOfItsNodeValues() {
        //given
        TreeNode root = new TreeNodeBuilder().treeNode("1,2,3,4,*,*,7,*,*,*,*,6");

        //when
        int maxSumPath = maximumSumPath.maxSumPath(root);

        //then
        int expected = 23;
        assertEquals(expected, maxSumPath);
    }

}