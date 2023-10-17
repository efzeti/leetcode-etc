package org.example.leetcode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode l = root.left;
        TreeNode r = root.right;

        root.left = r;
        root.right = l;

        return root;
    }
}
