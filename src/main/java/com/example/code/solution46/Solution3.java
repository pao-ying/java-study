package com.example.code.solution46;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    List<List<Integer>> answers = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        List<Integer> ans = new ArrayList<>();
        dfs(0, nums, ans, flag);
        return answers;
    }

    public void dfs(int index, int[] nums, List<Integer> ans, boolean[] flag) {
        if (ans.size() == nums.length) {
            answers.add(new ArrayList<>(ans));
        }
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            if (!flag[i]) {
                ans.add(target);
                // 注意 应使用 flag[i] 而不是 flag[nums[i]]
                flag[i] = true;
                dfs(index + 1, nums, ans, flag);
                flag[i] = false;
                ans.remove(ans.size() - 1);
            }
        }
    }
}
