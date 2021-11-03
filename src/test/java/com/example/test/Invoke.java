package com.example.test;

import com.example.code.TreeNode;

import java.util.Arrays;

public class Invoke {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.sumPath(TreeNode.makeTree2(Arrays.asList(1, 4, 5, 2, 3, 1, 2, 1, 4, 1, null, 2, null, 5, 4, null, 6), 0), 8));
    }
}
