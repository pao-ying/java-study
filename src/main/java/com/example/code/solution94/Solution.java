package com.example.code.solution94;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        getNode(answer, root);
        return answer;
    }

    public void getNode(List<Integer> answer, TreeNode root) {
        if (root == null) {
            return;
        }
        getNode(answer, root.left);
        answer.add(root.val);
        getNode(answer, root.right);
    }
}
