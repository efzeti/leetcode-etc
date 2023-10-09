package org.example.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
https://leetcode.com/problems/combination-sum/
**/
public class CombinationsSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> combinations = new ArrayList<>();
        getCombinations(combinations, new ArrayList<Integer>(), candidates, target, 0);

        return combinations;
    }

    private static void getCombinations(List<List<Integer>> combinations, List<Integer> current, int[] candidates, int target, int start) {
        if (target > 0) {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                current.add(candidates[i]);
                getCombinations(combinations, current, candidates, target - candidates[i], i);
                current.remove(current.size() - 1);
            }
        } else if (target == 0) {
            combinations.add(new ArrayList<>(current));
        }
    }
}
