package com.example.code.solution199;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return result;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        // 用来判断当前高度是否被访问过了
        if (result.size() == depth) {
            result.add(root.val);
        }
        dfs(root.right, depth + 1);
        dfs(root.left, depth + 1);
    }
}
