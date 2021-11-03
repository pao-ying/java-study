package com.example.review.tree;

import com.example.code.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class TraversalNotRecursion {
    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.println(cur.val);
            cur = cur.right;
        }
    }

    /*
    * 目的就是先访问子节点，再访问父节点
    * 1. 如果左右节点都为 null，则是叶子节点，可直接访问
    * 2. 如果 pre 是该节点的子节点，则说明子节点都已经访问过了，可访问父节点
    * */
    public void postorder(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        // 上一个访问的节点
        TreeNode pre = null;
        while (!stack.isEmpty()) {
            // 先获取，不使用 pop()
            TreeNode node = stack.peek();
            if ((node.left == null && node.right == null)
            || (pre != null && (pre == node.left || pre == node.right))) {
                System.out.println(node.val);
                stack.pop();
                pre = node;
            } else {
                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
            }
        }
    }

    public void levelorder(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }
}
