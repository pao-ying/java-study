package com.example.review.code.solution108;

import com.example.code.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        long pre = Long.MIN_VALUE;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (p.val <= pre) {
                return false;
            }
            pre = p.val;
            p = p.right;
        }
        return true;
    }
}
