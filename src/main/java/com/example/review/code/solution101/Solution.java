package com.example.review.code.solution101;

import com.example.code.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root.left);
        deque.offer(root.right);
        while (!deque.isEmpty()) {
            TreeNode p = deque.poll();
            TreeNode q = deque.poll();
            if (p == null && q == null) {
                continue;
            }
            if (p == null || q == null || p.val != q.val) {
                return false;
            }
            deque.offer(p.left);
            deque.offer(q.right);
            deque.offer(p.right);
            deque.offer(q.left);
        }
        return true;
    }
}
