package com.example.code.solution297;

import com.example.code.TreeNode;

public class Invoke {
    public static void main(String[] args) {
        Codec codec = new Codec();
        String str =                 codec.serialize(
                TreeNode.makeTree(
                        new int[]{4,-7,-3,-1,-1,-9,-3,9,-7,-4,-1,6,-1,-6,-6,-1,-1,0,6,5,-1,9,-1,-1,-1,-4,-1,-1,-1,-2},
                        0
                )
        );
        System.out.println(str);
        TreeNode.printTree(
                codec.deserialize(str)
        );
    }
}
