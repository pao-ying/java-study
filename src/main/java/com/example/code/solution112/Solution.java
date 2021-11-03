package com.example.code.solution112;

import com.example.code.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (targetSum == root.val && root.right == null && root.left == null) {
            return true;
        }
        // targetSum有可能就是负数
//        if (targetSum < 0) {
//            return false;
//        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
