package com.lukgru.jalgoarena.hard;

import com.lukgru.jalgoarena.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-09.
 */
public class TreeDecompressionTest {

    private TreeDecompression treeDecompression = new TreeDecompression();

    @Test
    public void givenNullRepresentationReturnNullTree() {
        //given
        String representation = null;

        //when
        TreeNode root = treeDecompression.decompressTree(representation);

        //then
        assertNull(root);
    }

    @Test
    public void givenOnlyAsteriskShouldReturnNullTree() {
        //given
        String representation = "*";

        //when
        TreeNode root = treeDecompression.decompressTree(representation);

        //then
        assertNull(root);

    }

    @Test
    public void givenEmptyRepresentationReturnNullTree() {
        //given
        String representation = "";

        //when
        TreeNode root = treeDecompression.decompressTree(representation);

        //then
        assertNull(root);
    }

    @Test
    public void givenOnlyOneElementShouldReturnOnlyOneNode() {
        //given
        String representation = "1";

        //when
        TreeNode root = treeDecompression.decompressTree(representation);

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
        TreeNode root = treeDecompression.decompressTree(representation);

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
        TreeNode root = treeDecompression.decompressTree(representation);

        //then
        TreeNode expected = new TreeNode(1, null, new TreeNode(2));
        assertEquals(expected, root);
    }

    @Test
    public void shouldCreateComplexTree() {
        //given
        String representation = "1,2,3,4,*,*,7";

        //when
        TreeNode root = treeDecompression.decompressTree(representation);

        //then
        TreeNode expected = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(7)));
        assertEquals(expected, root);
    }

    @Test
    public void shouldCreateFullThreeLevelTree() {
        //given
        String representation = "1,2,3,4,5,6,7";

        //when
        TreeNode root = treeDecompression.decompressTree(representation);

        //then
        TreeNode expected = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(expected, root);
    }

    @Test
    public void shouldIgnoreChildrenOfNullNode() {
        //given
        String representation = "1,*,2,*,*,*,3";

        //when
        TreeNode root = treeDecompression.decompressTree(representation);

        //then
        TreeNode expected = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        assertEquals(expected, root);
    }
}