package com.example.code.solution98;

import com.example.code.TreeNode;

public class Invoke {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        solution.isValidBST(
                TreeNode.makeTree(
                        new int[]{2, 1, 3},
                        0
                )
        );
    }
}
