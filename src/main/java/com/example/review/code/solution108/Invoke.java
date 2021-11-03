package com.example.review.code.solution108;

import com.example.code.TreeNode;

import java.util.Arrays;
import java.util.List;

public class Invoke {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isValidBST(
                TreeNode.makeTree2(Arrays.asList(5, 1, 4, null, null, 3, 6), 0)
        ));
    }
}
