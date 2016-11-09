package com.lukgru.jalgoarena;

/**
 * Created by Łukasz on 2016-11-09.
 */
public class TreeNodeBuilder {

    /**
     * Format: "1,2,3,4,5,6,7"
     *     1
     *    / \
     *   2  3
     *  /\  /\
     * 4 5 6 7
     * @param representation
     * @return
     */
    public TreeNode treeNode(String representation) {
        if (representation == null || representation.isEmpty()) return null;
        String[] stringNodes = representation.split(",");
        return node(stringNodes, 0);
    }

    private TreeNode node(String[] nodes, int nodeIndex) {
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
