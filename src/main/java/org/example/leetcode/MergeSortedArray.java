package org.example.leetcode;


import java.util.Arrays;

/**
https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
**/
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = nums1.length - nums2.length;
        int n = nums2.length;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i <  m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}
