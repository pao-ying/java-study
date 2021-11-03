package com.example.code.solution94;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        // 任意一个为空都跳出
        while (root != null || !stack.isEmpty()) {
            // 注意这里是 root != null 而不是 root.left != null
            while (root != null) {
                // 同时 push(root) 而不是 push(root.left)
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            answer.add(root.val);
            root = root.right;
        }
        return answer;
    }
}
