package com.example.review.code.solution239;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        int[] ans = new int[nums.length - k + 1];
        int left = 0;
        ans[left] = nums[queue.peekFirst()];
        left = 1;
        for (int right = k; right < nums.length; right++, left++) {
            while (!queue.isEmpty() && nums[right] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            while (!queue.isEmpty() && queue.peekFirst() < left) {
                queue.pollFirst();
            }
            queue.offerLast(right);
            ans[left] = nums[queue.peekFirst()];
        }
        return ans;
    }
}
