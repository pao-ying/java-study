package com.example.code.solution103;

import com.example.code.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answers = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        boolean isLeft = true;
        while (!queue.isEmpty()) {
            Deque<Integer> answer = new LinkedList<>();
            int curLevelSize = queue.size();
            for (int i = 0; i < curLevelSize; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                if (isLeft) {
                    answer.offerLast(node.val);
                } else {
                    answer.offerFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            answers.add(new LinkedList<>(answer));
            isLeft = !isLeft;
        }
        return answers;
    }
}
