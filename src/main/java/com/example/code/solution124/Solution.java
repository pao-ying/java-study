package com.example.code.solution124;

import com.example.code.TreeNode;

/*
* 考虑若题中去掉“不一定经过根节点”的条件，即一定经过根节点，
* 则解法变成，深度优先遍历，对于每一个节点的贡献值=max(left<0?0:left,right<0?0:right)+root一直往上递归即可
* 对于不一定经过根节点则意味着任意一个节点都可以被当作根节点
* */
public class Solution {
    int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxValue;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));
        // 即把每一个节点都当作根节点处理
        maxValue = Math.max(maxValue, root.val + left + right);
        return Math.max(left, right) + root.val;
    }
}
