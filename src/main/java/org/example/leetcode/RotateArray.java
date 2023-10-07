package org.example.leetcode;

/**
 * https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
 **/
public class RotateArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(input, k);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            nums[j++] = arr[i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            nums[j++] = arr[i];
        }
    }
}
