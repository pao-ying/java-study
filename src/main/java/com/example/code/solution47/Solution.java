package com.example.code.solution47;

import java.util.*;

/*
* 1 1 2
* 当第一次以第一个1开头时，因该考虑1 1 2
* 但是第二次以第二个1开头时，应该考虑重复了。
* 两者分辨的关键就是前一个相同的visited[i-1]是否为true，
* 为true就说明是第一次遍历，为false就说明不是第一次遍历了
* */
public class Solution {
    List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        dfs(nums, new ArrayList<>(), visited);
        return paths;
    }

    public void dfs(int[] nums, List<Integer> path, boolean[] visited) {
        if (path.size() == nums.length) {
            paths.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            if (i > 0 && !visited[i - 1] && nums[i - 1] == nums[i]) continue;
            path.add(nums[i]);
            visited[i] = true;
            dfs(nums, path, visited);
            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }
}
