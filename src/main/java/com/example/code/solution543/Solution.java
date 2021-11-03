package com.example.code.solution543;

import com.example.code.TreeNode;

/*
* 使用深度遍历，可能穿过根节点也可能不穿过，所以中途也需要判断大小
* */
public class Solution {

    int maxDistance = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        // 返回边的数目
        return Math.max(dfs(root), maxDistance) - 1;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        maxDistance = Math.max(left + right + 1, maxDistance);
        return Math.max(left, right) + 1;
    }
}
