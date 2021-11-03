package com.example.code.solution101;

import com.example.code.TreeNode;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                solution.isSymmetric(
                        TreeNode.makeTree(
                                new int[]{1, 2, 2, 3, 4, 4, 3},
                                0
                        )
                )
        );
    }
}
