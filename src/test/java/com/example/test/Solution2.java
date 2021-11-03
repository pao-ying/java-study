package com.example.test;

import com.example.code.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    int sum = 0;
    public int sumPath (TreeNode root, int target) {
        // write code here
        dfs(root, target, 0, new ArrayList<>());
        return sum;
    }

    public void dfs(TreeNode root, int target, int cur, List<Integer> path) {
        if (root == null) {
            return ;
        }
        cur = cur + root.val;
        if (cur == target) {
            sum ++;
        }
        int temp = cur;
        for (Integer num: path) {
            temp -= num;
            if (temp == target) {
                sum++;
            }
        }
        path.add(root.val);
        dfs(root.left, target, cur, path);
        dfs(root.right, target, cur, path);
        path.remove(path.size() - 1);
    }
}