package com.lukgru.jalgoarena;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-09.
 */
public class TreeNodeBuilderTest {

    private TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();

    @Test
    public void givenNullRepresentationReturnNullTree() {
        //given
        String representation = null;

        //when
        TreeNode root = treeNodeBuilder.treeNode(representation);

        //then
        assertNull(root);
    }

    @Test
    public void givenEmptyRepresentationReturnNullTree() {
        //given
        String representation = "";

        //when
        TreeNode root = treeNodeBuilder.treeNode(representation);

        //then
        assertNull(root);
    }

    @Test
    public void givenOnlyOneElementShouldReturnOnlyOneNode() {
        //given
        String representation = "1";

        //when
        TreeNode root = treeNodeBuilder.treeNode(representation);

        //then
        assertNotNull(root);
        assertEquals(1, root.data);
        assertNull(root.left);
        assertNull(root.right);
    }

    @Test
    public void givenOneElementFollowedByTwoAsterisksShouldReturnOneNodeWithNullChildren() {
        //given
        String representation = "1,*,*";

        //when
        TreeNode root = treeNodeBuilder.treeNode(representation);

        //then
        assertNotNull(root);
        assertEquals(1, root.data);
        assertNull(root.left);
        assertNull(root.right);
    }

    @Test
    public void shouldInterpretAsteriskAsNullNode() {
        //given
        String representation = "1,*,2";

        //when
        TreeNode root = treeNodeBuilder.treeNode(representation);

        //then
        TreeNode expected = new TreeNode(1, null, new TreeNode(2));
        assertEquals(expected, root);
    }

    @Test
    public void shouldCreateComplexTree() {
        //given
        String representation = "1,2,3,4,*,*,5";

        //when
        TreeNode root = treeNodeBuilder.treeNode(representation);

        //then
        TreeNode expected = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(5)));
        assertEquals(expected, root);
    }
}