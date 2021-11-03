package com.example.code.solution129;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Invoke {
    public static void main(String[] args) {
        int[] tree = new int[]{4, 9, 0, 5, 1, -1, -1};
        TreeNode root = TreeNode.makeTree(tree, 0);
//        TreeNode.printTree(root);

        Solution solution = new Solution();
        System.out.println(solution.sumNumbers(root));
    }
}
