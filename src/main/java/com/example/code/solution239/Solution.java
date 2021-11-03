package com.example.code.solution239;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
* 使用优先队列，队头永远都是当前队列的最大值。
* 记录最大值的位置，当滑动窗口左侧超出最大值的位置时，如 [5 4 3] 2 -> 5 [4 3 2]，就将队头元素删除
* 注意，只有当最大值不在该区间的时候，才会对队列进行poll()，所以直接i < left 的元素其实还在队列里面，
* 只是比较时我们不关心而已，所以当poll()操作时，使用while，排除那些元素。
* */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0]?o2[0] - o1[0]: o2[1] - o1[1];
            }
        });
        // 记录值及其位置，其中队头就是最大值
        for (int i = 0; i < k; i++) {
            queue.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];
        // 附上初值
        ans[0] = queue.peek()[0];
        for (int i = k; i < n; i++) {
            queue.offer(new int[]{nums[i], i});
            int left = i - k + 1;
            // 最大值不在滑动窗口中时
            // 注意这里需要使用while，因为只有当最大值不再该区间的时候才更新，
            // 所以队列中会含有其它不在区间内的数
            while (queue.peek()[1] < left) {
                queue.poll();
            }
            ans[left] = queue.peek()[0];
        }
        return ans;
    }
}
