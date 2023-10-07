package org.example.leetcode;

/**
 * https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
 **/
public class RemoveElement {

    public static void main(String[] args) {
//        int[] arr = {3,2,2,3};
        int[] arr = {0,1,2,2,3,0,4,2};
        removeElement(arr, 2);
    }


    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
