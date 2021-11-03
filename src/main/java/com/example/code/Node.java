package com.example.code;

import java.util.Deque;
import java.util.LinkedList;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node() {}
    public Node(int val) { this.val = val; }
    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static Node makeTree(int[] nums, int start) {
        if (start > nums.length - 1 || nums[start] == -1) {
            return null;
        }

        Node root = new Node(nums[start]);

        int left = 2 * start + 1;
        int right = 2 * start + 2;

        root.left = makeTree(nums, left);
        root.right = makeTree(nums, right);

        return root;
    }

    public static void printTree(Node root) {
        if (root == null) {
            return ;
        }
        Deque<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}
