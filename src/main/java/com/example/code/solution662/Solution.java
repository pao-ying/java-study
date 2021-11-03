package com.example.code.solution662;

import com.example.code.TreeNode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
* 层次遍历，记录每一层中最左和最右的位置，2*i, 2*i+1.
*
* */
public class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        Deque<posNode> queue = new LinkedList<>();
        queue.offer(new posNode(root, 1));
        while (!queue.isEmpty()) {
            res = Math.max(queue.peekLast().pos - queue.peekFirst().pos + 1, res);
            // 注意 queue.size() 不能放在循环中，因为queue一直在变化！！！！
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                posNode top = queue.poll();
                if (top.node.left != null) {
                    queue.offer(new posNode(top.node.left, 2 * top.pos));
                }
                if (top.node.right != null) {
                    queue.offer(new posNode(top.node.right, 2 * top.pos + 1));
                }
            }
        }
        return res;
    }

    class posNode {
        TreeNode node;
        int pos;
        posNode (TreeNode node, int pos){
            this.node = node;
            this.pos = pos;
        }
    }
}
