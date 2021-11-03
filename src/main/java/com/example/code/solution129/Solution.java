package com.example.code.solution129;

import com.example.code.TreeNode;

import java.util.*;

public class Solution {

    List<List<Integer>> paths = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        dfs(root, new ArrayList<>());
        int ans = 0;
        for (List<Integer> path : paths) {
            int len = path.size(), sum = 0;
            for (int j = 1; j <= len; j++) {
                int k1 = path.get(j - 1);
                double k2 = Math.pow(10, len - j);
                sum += k1 * k2;
            }
            ans += sum;
        }
        return ans;
    }

    public void dfs(TreeNode root, List<Integer> path) {
        if (root == null) {
            return ;
        }
        if (root.left == null && root.right == null) {
            path.add(root.val);
            paths.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }
        path.add(root.val);
        dfs(root.left, path);
        dfs(root.right, path);
        path.remove(path.size() - 1);
    }
}
