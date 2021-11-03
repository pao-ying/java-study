package com.example.code;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode makeTree(int[] nums, int start) {
        if (start > nums.length - 1 || nums[start] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(nums[start]);

        int left = 2 * start + 1;
        int right = 2 * start + 2;

        root.left = makeTree(nums, left);
        root.right = makeTree(nums, right);

        return root;
    }

    public static TreeNode makeTree2(List<Integer> nums, int start) {
        if (start > nums.size() - 1 || nums.get(start) == null) {
            return null;
        }

        TreeNode root = new TreeNode(nums.get(start));

        int left = 2 * start + 1;
        int right = 2 * start + 2;

        root.left = makeTree2(nums, left);
        root.right = makeTree2(nums, right);

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return ;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }


    public static void main(String[] args) {
        TreeNode root = makeTree2(Arrays.asList(1, null, 2, 3),0);
        TreeNode.printTree(root);
    }
}
