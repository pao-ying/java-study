package com.example.code.solution101;

import com.example.code.TreeNode;

/*
* dfs 通过两个指针p和q，遍历 p.left , q.right和 p.right 和 q.left
*
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && dfs(p.left, q.right) && dfs(p.right, q.left);
    }
}
