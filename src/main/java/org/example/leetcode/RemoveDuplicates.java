package org.example.leetcode;


/**
 https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 **/
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {

        int index = 1;
        int lastUnique = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (lastUnique != nums[i]) {
                lastUnique = nums[i];
                nums[index] = nums[i];
                index++;
                count++;
            }
        }
        return count;
    }
}
