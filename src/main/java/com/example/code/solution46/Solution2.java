package com.example.code.solution46;

import java.util.*;

public class Solution2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answers = new ArrayList<>();
        int length = nums.length;
        List<Integer> referNums = new ArrayList<>();
        for (int num : nums) {
            referNums.add(num);
        }
        dfs(0, length, referNums, answers);
        return answers;
    }

    private void dfs(int index, int length, List<Integer> referNums, List<List<Integer>> answers) {
        if (index == length) {
            answers.add(new ArrayList<>(referNums));
        }
        // 这里是j = index ，而不是 j = index + 1，因为如果是index + 1，则直接将 123变为 213，则123的数据就会丢失
        for (int j = index; j < length; j++) {
            Collections.swap(referNums, index, j);
            dfs(index + 1, length, referNums, answers);
            Collections.swap(referNums, index, j);
        }
    }
}
