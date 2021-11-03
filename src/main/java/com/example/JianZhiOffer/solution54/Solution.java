package com.example.JianZhiOffer.solution54;

import com.example.code.TreeNode;

public class Solution {
    int res = 0, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root) {
        if (root == null || k < 0) {
            return ;
        }
        dfs(root.right);
        k--;
        if (k == 0) {
            res = root.val;
            return ;
        }
        dfs(root.left);
    }
}
