package com.example.code.solution297;

import com.example.code.TreeNode;

/*
* 注意负数情况所以使用,分割
* */
public class Codec {

    int index = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "x";
        }
        String left = serialize(root.left);
        String right = serialize(root.right);
        return root.val + "," + left + "," + right;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        index = 0;
        return deserialize2(data.split(","));
    }

    public TreeNode deserialize2(String[] data) {
        if (index >= data.length || data[index].equals("x")) {
            return null;
        }
        TreeNode root = new TreeNode( Integer.parseInt(data[index]));
        index++;
        root.left = deserialize2(data);
        index++;
        root.right = deserialize2(data);
        return root;
    }
}
