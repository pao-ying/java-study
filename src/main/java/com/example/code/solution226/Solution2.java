package com.example.code.solution226;

import com.example.code.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();
            TreeNode temp = top.left;
            top.left = top.right;
            top.right = temp;
            if (top.left != null) {
                queue.offer(top.left);
            }
            if (top.right != null) {
                queue.offer(top.right);
            }
        }
        return root;
    }
}
