package com.example.code.solution102;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static List<List<Integer>> answers = new ArrayList<>();

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root != null) {
            dfs(0, root);
        }
        return answers;
    }

    public static void dfs(int level, TreeNode node) {
        if (answers.size() == level) {
            answers.add(new ArrayList<>());
        }
        answers.get(level).add(node.val);
        if (node.left != null) {
            dfs(level + 1, node.left);
        }
        if (node.right != null) {
            dfs(level + 1, node.right);
        }
    }
}
