package com.example.code.solution42;

import java.util.Deque;
import java.util.LinkedList;

// 使用栈的方法，
// 当高度降低，说明可以存水；当高度升高，说明积水在这里停下。
// height[current] <= stack.peek() 可存水
// height[current] > stack.peek() 积水在这里停下，可计算积水量
public class Solution2 {
    public int trap(int[] height) {
        Deque<Integer> stack = new LinkedList<>();
        int current = 0, length = height.length, sum = 0;
        while (current <= length) {
            // 积水在这里停下；注意这里是while，当高度降低遇到高度升高时，判断之前每个点可存储的水量。
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = height[stack.pop()];
                // 当去除一个时，stack就为空，就说明当前栈高度为2，不能存水
                if (stack.isEmpty()) break;
                int distance = current - stack.peek() - 1;
                int min = Math.min(height[current], height[stack.peek()]);
                sum += distance * (min - top);
            }
            stack.push(current);
            current ++;
        }
        return sum;
    }
}
