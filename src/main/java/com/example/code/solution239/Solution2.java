package com.example.code.solution239;

import java.util.Deque;
import java.util.LinkedList;

/*
* 使用双向队列，维护一个从大到小的队列。使用left 和 right 来保证区间的有效性。
* 对于right+1，判断队尾是否大于a[right+1]，不大于就删除，一次循环，直到满足条件。
* 获取当前队列的最大值，这时候判断队头是否在区间范围内，即i>=left，不在的话就循环去头，在的话就是该区间最大值。
* */
public class Solution2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len - k + 1];
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        ans[0] = nums[queue.peekFirst()];
        for (int i = k; i < len; i++) {
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offerLast(i);
            int left = i - k + 1;
            while (!queue.isEmpty() && queue.peekFirst() < left) {
                queue.pollFirst();
            }
            ans[left] = nums[queue.peekFirst()];
        }
        return ans;
    }
}
