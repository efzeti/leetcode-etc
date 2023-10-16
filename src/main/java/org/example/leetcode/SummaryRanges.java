package org.example.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/summary-ranges/
 **/
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        } else if (nums.length == 1) {
            return Arrays.asList("-1");
        }
        List<String> out = new ArrayList<>();
        int start = nums[0];
        int incr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == incr + 1) {
                incr++;
            } else {
                if (start == incr) {
                    out.add(String.valueOf(start));
                    start = nums[i];
                    incr = nums[i];
                } else {
                    out.add(start + "->" + incr);
                    start = nums[i];
                    incr = nums[i];
                }
            }
            if (i == nums.length - 1) {
                out.add(start == incr ? String.valueOf(start) : start + "->" + incr);
            }
        }

        return out;
    }
}
