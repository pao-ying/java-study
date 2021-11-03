package com.example.code.solution958;

import com.example.code.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/*
* 空值也入队列，若队头为空，则判断队列剩下的是否都为空，为则是完全二叉树。
* */
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
            if (top == null) {
                // 或者添加flag也行，就不用跳出再循环了
                // flag = true;
                break;
            }
            // if (flag) return false;
            queue.offer(top.left);
            queue.offer(top.right);
        }
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
            if (top != null) {
                return false;
            }
        }
        return true;
    }
}
