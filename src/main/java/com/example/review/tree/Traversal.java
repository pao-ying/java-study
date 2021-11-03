package com.example.review.tree;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Traversal {
    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }


    public void levelorder(TreeNode root) {
        List<List<Integer>> tree = new ArrayList<>();
        levelorder2(root, 1, tree);
        for (List<Integer> integers : tree) {
            for (Integer integer : integers) {
                System.out.printf("%d ", integer);
            }
        }
    }

    public void levelorder2(TreeNode root, int level, List<List<Integer>> tree) {
        if (root == null) {
            return;
        }
        if (tree.size() + 1 == level) {
            tree.add(new ArrayList<>());
        }
        tree.get(level - 1).add(root.val);
        levelorder2(root.left, level + 1, tree);
        levelorder2(root.right, level + 1, tree);
    }
}
