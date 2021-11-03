package com.example.code.solution98;

import com.example.code.TreeNode;

/*
* 二叉搜索树性质，中序遍历是从小大大的
* */
public class Solution {
    // 用 pre 来保存上一次访问的节点
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        return verify(root);
    }

    public boolean verify(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!verify(root.left)) {
            return false;
        }
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        return verify(root.right);
    }
}
