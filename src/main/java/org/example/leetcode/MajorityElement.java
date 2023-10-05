package org.example.leetcode;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 https://leetcode.com/problems/majority-element-ii/?envType=daily-question&envId=2023-10-05
 **/

public class MajorityElement {

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i : nums) {
            if (intMap.containsKey(i)) {
                intMap.put(i, intMap.get(i) + 1);
            } else {
                intMap.put(i, 1);
            }
        }

        return intMap.entrySet().stream().filter(e -> e.getValue() > n / 3).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
