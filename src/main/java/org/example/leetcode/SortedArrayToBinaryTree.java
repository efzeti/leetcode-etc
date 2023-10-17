package org.example.leetcode;


import javax.swing.tree.TreeNode;

/**
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
**/
public class SortedArrayToBinaryTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int nums[], int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }

        int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
        TreeNode root = new TreeNode(nums[midIndex]);
        root.left = createTree(nums, leftIndex, midIndex - 1);
        root.right = createTree(nums, midIndex + 1, rightIndex);

        return root;
    }
}
