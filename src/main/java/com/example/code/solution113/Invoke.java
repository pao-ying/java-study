package com.example.code.solution113;

import com.example.code.TreeNode;

public class Invoke {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] tree = new int[]{5,4,8,11,-1,13,4,7,2,-1,-1,5,1};
        System.out.println(
                solution.pathSum(
                        TreeNode.makeTree(tree, 0),
                        22
                )
        );
        TreeNode.printTree(TreeNode.makeTree(tree, 0));
    }
}
