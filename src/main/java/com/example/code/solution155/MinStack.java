package com.example.code.solution155;

import java.util.Deque;
import java.util.LinkedList;

/*
* 设计两个栈，一个存值，一个存最小值。
* 边存值时，边存入当时比较下的最小值
* valueStack: -2 -1 -3  4
* minStack:   -2 -2 -3 -3
* */
public class MinStack {
    Deque<Integer> valueStack;
    Deque<Integer> minStack;

    public MinStack() {
        valueStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        valueStack.push(val);
        minStack.push(Math.min(minStack.peek(), val));
    }

    public void pop() {
        valueStack.pop();
        minStack.pop();
    }

    public int top() {
        return valueStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
