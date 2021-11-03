package com.example.code.solution113;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, new ArrayList<>(), targetSum);
        return paths;
    }

    public void dfs(TreeNode root, List<Integer> path, int target) {
        if (root == null) {
            return ;
        }
        if (root.left == null && root.right == null) {
            path.add(root.val);
            int sum = 0;
            for (Integer integer : path) {
                sum = sum + integer;
            }
            if (sum == target) {
                paths.add(new ArrayList<>(path));
            }
            path.remove(path.size() - 1);
            return;
        }
        path.add(root.val);
        dfs(root.left, path, target);
        dfs(root.right, path, target);
        path.remove(path.size() - 1);
    }
}
