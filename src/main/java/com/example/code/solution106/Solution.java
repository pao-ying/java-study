package com.example.code.solution106;

import com.example.code.TreeNode;

import java.util.HashMap;
import java.util.Map;

/*
* 中序后序确定二叉树就是将 后序反着来看。
* 前序是从左往右每个一个节点代表root，后序就是从右往左
* 特别的是，前序root相邻的是左子树，后序root相邻的是右子树
* */
public class Solution {
    Map<Integer, Integer> rootMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int length = inorder.length;
        for (int i = 0; i < length; i++) {
            rootMap.put(inorder[i], i);
        }
        return myBuildTree(inorder, postorder, 0, length - 1, 0, length - 1);
    }

    public TreeNode myBuildTree(int[] inOrder, int[] postOrder, int inLeft, int inRight, int postLeft, int postRight) {
        if (postLeft > postRight || inLeft > inRight) {
            return null;
        }
        int postRoot = postOrder[postRight];
        int inRoot = rootMap.get(postRoot);
        int rightNodes = inRight - inRoot;

        TreeNode root = new TreeNode(postRoot);
        root.right = myBuildTree(inOrder, postOrder,
                inRoot + 1,
                inRoot + rightNodes,
                postRight - rightNodes,
                postRight - 1);

        root.left = myBuildTree(inOrder, postOrder,
                inLeft,
                inRoot - 1,
                postLeft,
                postRight - rightNodes - 1);
        return root;
    }
}
