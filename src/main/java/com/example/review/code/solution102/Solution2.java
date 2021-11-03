package com.example.review.code.solution102;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    public void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == ans.size()) {
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
