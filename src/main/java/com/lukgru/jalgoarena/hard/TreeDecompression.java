package com.lukgru.jalgoarena.hard;

import com.lukgru.jalgoarena.TreeNode;

/**
 * Given a binary tree, write a method decompressTree that decompresses that tree (reconstructs the tree) and returns the root TreeNode. The compression algorithm included traversing the tree level by level, from the left to the right. The TreeNode's data values were appended to the String, delimited by commas. Also, null TreeNodes were denoted by appending an asterisk - *. The input String denotes the structure of a Full Binary Tree - i.e. a tree that is structurally balanced. However, the reconstructed tree may not be a full tree as the String included * characters, which represent null TreeNodes
 ###Note
 You can assume that if a Binary Tree contains k levels, the compressed String will contain 2^k-1 elements - either numbers or *.
 Example
 1
 / \
 2   3     ==> Compressed String = '1,2,3,4,5,6,7'
 / \ / \
 4  5 6  7


 null____*____1,2,3,4,5,6,7________1,2,3,4,*,*,7____1____1,*,2,*,*,*,3____

 */
public class TreeDecompression {

    public TreeNode decompressTree(String root) {
        if (root == null || root.isEmpty()) return null;
        String[] stringNodes = root.split(",");
        return node(stringNodes, 0);
    }

    public TreeNode node(String[] nodes, int nodeIndex) {
        if (nodeIndex >= nodes.length) return null;

        TreeNode node = null;
        String nodeValue = nodes[nodeIndex];
        if (!"*".equals(nodeValue)) {
            node = new TreeNode(Integer.valueOf(nodeValue));
            node.left = node(nodes, 2 * nodeIndex + 1);
            node.right = node(nodes, 2 * nodeIndex + 2);
        }
        return node;
    }

}
