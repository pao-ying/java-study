package com.example.review.code.solution101;

import com.example.code.TreeNode;

import java.util.Arrays;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(
                TreeNode.makeTree2(Arrays.asList(1, 2, 2, 3, 4, 4, 3), 0)
        ));
    }
}
