package com.example.code.solution105;

import com.example.code.TreeNode;

import java.util.HashMap;
import java.util.Map;

/*
* 前序遍历
* --> 根节点 [左子树] [右子树]
* 中序遍历
* --> [左子树] 根节点 [右子树]
*
* */
public class Solution {

    Map<Integer, Integer> rootMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        // 通过哈希表，可以在 前序遍历表中快速查出 中序遍历表中root位置
        rootMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            rootMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, length - 1, 0, length - 1);
    }

    public TreeNode myBuildTree(int[] preOrder, int[] inOrder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        // 查找根节点
        int preRoot = preOrder[preLeft];
        // 查找中序遍历中根节点的位置, 注意是 preRoot
        int inRoot = rootMap.get(preRoot);
        int leftNodes = inRoot - inLeft;// 左子树节点数量

        // 建立根节点
        TreeNode root = new TreeNode(preRoot);
        root.left = myBuildTree(preOrder, inOrder,
                preLeft + 1,
                preLeft + leftNodes,
                inLeft,
                inRoot - 1);
        root.right = myBuildTree(preOrder, inOrder,
                preLeft + leftNodes + 1,
                preRight,
                inRoot + 1,
                inRight
                );
        return root;
    }
}
