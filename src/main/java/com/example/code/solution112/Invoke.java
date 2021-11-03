package com.example.code.solution112;

import com.example.code.TreeNode;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                solution.hasPathSum(
                        TreeNode.makeTree(
                                new int[]{-2, -1, -3},
                                0
                        ),
                        -5
                )
        );
    }
}
