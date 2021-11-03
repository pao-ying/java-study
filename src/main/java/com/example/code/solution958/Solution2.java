package com.example.code.solution958;

import com.example.code.TreeNode;

/*
* 对于一个完整二叉树来说，[1, 2, 3, 4,5 ,6]最后深度遍历的当前编号等于非空节点数量，如 6 = 6
* [1, null, 2, 3, 4], 5 != 4
* */
public class Solution2 {

    int sum = 0;
    int maxNode = 0;

    public boolean isCompleteTree(TreeNode root) {
        dfs(root, 1);
        return sum == maxNode;
    }

    public void dfs(TreeNode root, int k) {
        if (root == null) {
            return ;
        }
        // 非空节点数量，即编号
        sum++;
        // 记录最大的编号
        maxNode = Math.max(maxNode, k);
        dfs(root.left, k * 2);
        dfs(root.right, k * 2 + 1);
    }
}
