package com.example.review.tree;

import com.example.code.TreeNode;

import java.util.Arrays;

public class Invoke {
    public static void main(String[] args) {
        TreeNode root = TreeNode.makeTree2(Arrays.asList(1, 4, 8, 5, 3, null, 2), 0);
        Traversal traversal = new Traversal();
        TraversalNotRecursion traversal2 = new TraversalNotRecursion();
//        traversal.preorder(root);
//        traversal.inorder(root);
//        traversal.postorder(root);
//        traversal.levelorder(root);
//        traversal2.preorder(root);
//        traversal2.inorder(root);
//        traversal2.postorder(root);
        traversal2.levelorder(root);
    }

}
