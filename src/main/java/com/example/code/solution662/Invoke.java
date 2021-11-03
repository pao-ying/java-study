package com.example.code.solution662;

import com.example.code.TreeNode;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.widthOfBinaryTree(
                TreeNode.makeTree(
                        new int[]{1,3, -1, 5, 3},
                        0
                )
        );
    }
}
