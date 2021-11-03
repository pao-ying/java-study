package com.example.code.solution101;

import com.example.code.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
* 队列，每次比较两个元素，进队列时交叉进入, p.left, q.right, p.right, q.left
* 对于null，也插入队列
* */
public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            TreeNode q = queue.poll();
            if (p == null && q == null) {
                continue;
            }
            if ((p == null || q == null) || p.val != q.val) {
                return false;
            }
            queue.offer(p.left);
            queue.offer(q.right);

            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }
}
