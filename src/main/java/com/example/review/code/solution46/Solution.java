package com.example.review.code.solution46;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        dfs(nums, visited, new ArrayList<>());
        return paths;
    }

    public void dfs(int[] nums, boolean[] visited, List<Integer> path) {
        if (path.size() == nums.length) {
            paths.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                path.add(nums[i]);
                dfs(nums, visited, path);
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
    }
}
