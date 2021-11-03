package com.example.code.solution155;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack2 {
    Deque<int[]> stack = new LinkedList<>();

    public void push(int x) {
        if (stack.size() == 0) {
            stack.push(new int[]{x, x});
        } else {
            int[] top = stack.peek();
            stack.push(new int[]{x, Math.min(x, top[1])});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
