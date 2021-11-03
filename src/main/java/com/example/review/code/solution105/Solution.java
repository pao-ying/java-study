package com.example.review.code.solution105;

import com.example.code.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildMyTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildMyTree(int[] preorder, int preLeft, int preRight,
                                int[] inorder, int inLeft, int inRight) {
        if (preLeft >= preorder.length || preRight >= preorder.length || inLeft >= inorder.length || inRight < 0 ) {
            return null;
        }
        int inPos = map.get(preorder[preLeft]);
        TreeNode root = new TreeNode(preorder[preLeft]);
        root.left = buildMyTree(preorder, preLeft + 1, preLeft + (inPos - inLeft),
                inorder, inLeft, inPos - 1);
        root.right = buildMyTree(preorder, preLeft + (inPos - inLeft + 1), preRight,
                inorder, inPos + 1, inRight);
        return root;
    }
}
