package com.example.code.solution98;

import com.example.code.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        double inorder = -Double.MAX_VALUE;
        while (!stack.isEmpty() || p != null ) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (p.val <= inorder) {
                return false;
            }
            inorder = p.val;
            p = p.right;
        }
        return true;
    }
}
