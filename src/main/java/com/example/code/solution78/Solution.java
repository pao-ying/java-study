package com.example.code.solution78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return res;
    }

    public void dfs(int[] nums, int start, List<Integer> ans) {
        res.add(new ArrayList<>(ans));
        for (int i = start; i < nums.length; i++) {
            ans.add(nums[i]);
            dfs(nums, i + 1, ans);
            ans.remove(ans.size() - 1);
        }
    }
}
