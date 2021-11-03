package com.example.code.solution114;

import com.example.code.TreeNode;

/*
* 使用prev记录上一次使用的节点
* */
public class Solution {

    TreeNode prev = new TreeNode();

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        prev.right = root;
        prev = root;
        TreeNode right = root.right;
        flatten(root.left);
        root.left = null;
        flatten(right);
    }

}
