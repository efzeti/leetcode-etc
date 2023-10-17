package org.example.leetcode.model;


/**
 * https://leetcode.com/problems/search-insert-position/
 **/
public class SearchInsertPosition {


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;

        System.out.println(searchInsert(arr, target));

    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int center = (start + end) / 2;
            if (nums[center] == target) {
                return center;
            }
            else if(nums[center] > target) {
                end = center - 1;
            }
            else {
                start = center + 1;
            }
        }
        return start;
    }

}
