package com.example.code.solution39;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, new ArrayList<>(), 0, 0, target);
        return ans;
    }

    // 也可以直接 target--，这样能少一个变量
    public void dfs(int[] candidates, List<Integer> res, int cur, int start, int target) {
        if (res.size() >= 150) {
            return;
        }
        if (cur == target) {
            ans.add(new ArrayList<>(res));
            return;
        }
        if (cur > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            cur += candidates[i];
            res.add(candidates[i]);
            dfs(candidates, res, cur, i, target);
            res.remove(res.size() - 1);
            cur -= candidates[i];
        }
    }
}
