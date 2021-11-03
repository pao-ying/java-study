package com.example.review.code.solution103;

import com.example.code.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> paths = new ArrayList<>();
        boolean dir = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> path = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (dir) {
                    path.addLast(node.val);
                } else {
                    path.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            dir = !dir;
            paths.add(new ArrayList<>(path));
        }
        return paths;
    }
}
