package com.example.code.solution40;

import java.util.*;

/*
* 这个剪枝的方法是，先将数组进行排序，如果递归是以某个值开头的，则观察 a[i-1] 和 a[i] 是否相等，
* 相等，则代表在上一层已经遍历过了
* */
public class Solution {
    List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>());
        return paths;
    }

    public void dfs(int[] candidates, int target, int start, List<Integer> path) {
        if (target == 0) {
            paths.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i != start && candidates[i] == candidates[i - 1]) continue;
            if (target - candidates[i] < 0) break;
            path.add(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
