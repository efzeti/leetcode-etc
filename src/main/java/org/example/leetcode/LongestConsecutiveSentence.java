package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;


/**
https://leetcode.com/problems/longest-consecutive-sequence/
**/
public class LongestConsecutiveSentence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ints = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            ints.add(nums[i]);
        }


        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 1;
            while (ints.contains(--num)) {
                count++;
                ints.remove(num);
            }

            num = nums[i];
            while (ints.contains(++num)) {
                count++;
                ints.remove(num);
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
