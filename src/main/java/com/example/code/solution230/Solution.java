package com.example.code.solution230;

import com.example.code.TreeNode;

public class Solution {
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        return dfs(root, k);
    }

    public int dfs(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        int left = dfs(root.left, k);
        if (left != -1) {
            return left;
        }
        count++;
        if (count == k) {
            return root.val;
        }
        int right = dfs(root.right, k);
        if (right != -1) {
            return right;
        }
        return -1;
    }
}
