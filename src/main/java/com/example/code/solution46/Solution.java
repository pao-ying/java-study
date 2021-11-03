package com.example.code.solution46;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Deque<Integer> result = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        int depth = 0, maxDepth = nums.length;
        dfs(nums, depth, maxDepth, result, results, used);
        return results;
    }

    private void dfs(int[] nums, int depth, int maxDepth, Deque<Integer> result, List<List<Integer>> results, boolean[] used) {
        if (depth == maxDepth) {
            results.add(new ArrayList<>(result));
            return;
        }
        for (int i = 0; i < maxDepth; i++) {
            if (!used[i]) {
                used[i] = true;
                result.push(nums[i]);
                dfs(nums, depth + 1, maxDepth, result, results, used);
                used[i] = false;
                result.pop();
            }
        }
    }
}
