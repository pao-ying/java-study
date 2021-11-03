package com.example.code.solution36;

import com.example.code.Node;

/*
* 使用 head 记录最左边的节点，使用 prev 记录前一个节点，使用 cur 记录当前节点
* 中序遍历
* prev.right = cur;
* cur.left = prev;
* */
public class Solution {

    Node prev;
    Node head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        dfs(root);
        head.left = prev;
        prev.right = head;
        return head;
    }

    public void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (prev == null) {
            head = root;
        } else {
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        dfs(root.right);
    }
}
