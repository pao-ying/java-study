package com.example.review.code.solution199;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    int[] level = new int[101];

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Arrays.fill(level, -1);
        dfs(root, 0);
        List<Integer> ans = new ArrayList<>();
        for (int j : level) {
            if (j == -1) {
                break;
            }
            ans.add(j);
        }
        return ans;
    }

    public void dfs(TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (level[height] == -1) {
            level[height] = root.val;
        }
        dfs(root.right, height + 1);
        dfs(root.left, height + 1);
    }
}
