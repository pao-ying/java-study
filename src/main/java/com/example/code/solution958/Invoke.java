package com.example.code.solution958;

import com.example.code.TreeNode;

public class Invoke {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(
                solution.isCompleteTree(
                        TreeNode.makeTree(new int[]{1, 2, 3, 4, 5, -1, 7}, 0)
                )
        );
    }
}
