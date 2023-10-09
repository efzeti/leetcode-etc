package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
https://leetcode.com/problems/two-sum/
**/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ints = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (ints.containsKey(target - nums[i])) {
                return new int[]{ints.get(target - nums[i]), i};
            }
            ints.put(nums[i], i);
        }

        return new int[2];
    }
}
