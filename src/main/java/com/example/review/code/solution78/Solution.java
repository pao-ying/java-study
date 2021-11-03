package com.example.review.code.solution78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return paths;
    }

    public void dfs(int[] nums, int start, List<Integer> path) {
        paths.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, start + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
