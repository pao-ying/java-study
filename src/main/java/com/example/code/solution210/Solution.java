package com.example.code.solution210;

import java.util.Deque;
import java.util.LinkedList;

/*
* 拓扑排序
* */
public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) {
            return new int[]{};
        }
        int[] inDegrees = new int[numCourses];
        // 查看每个点的入度值
        for (int[] p : prerequisites) {
            inDegrees[p[0]]++;
        }
        // 入度为0的点入队列
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        int[] res = new int[numCourses];
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            res[count++] = cur;
            // 检索与该点连接的点, 连接的点入度-1
            for (int[] p : prerequisites) {
                if (p[1] == cur) {
                    inDegrees[p[0]]--;
                    // 如果入度为0，添加进队列
                    if (inDegrees[p[0]] == 0) {
                        queue.offer(p[0]);
                    }
                }

            }
        }
        // 判断是否存在环
        if (count == numCourses) {
            return res;
        }
        return new int[0];
    }
}
