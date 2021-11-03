package com.example.code.solution56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        // 区间按左端点排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int left = intervals[i][0], right = intervals[i][1];
            // 二区间左端点小于一区间右端点
            // 注意! 比较的是 ans 里面已经储存的值，而不是intervals
            if (left <= ans.get(ans.size() - 1)[1]) {
                // 合并两区间的右端点
                // 注意不是比较 intervals[i - 1][1]，因为intervals一直在动
                ans.get(ans.size() - 1)[1] = Math.max(right, ans.get(ans.size() - 1)[1]);
            } else {
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
