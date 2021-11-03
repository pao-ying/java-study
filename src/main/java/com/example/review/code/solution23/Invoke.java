package com.example.review.code.solution23;

import com.example.code.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Invoke {
    public static void main(String[] args) {
        List<ListNode> lists = new ArrayList<>();
        int[] nums = new int[]{1, 2, 2, 1, 1, 2};
        for (int num : nums) {
            lists.add(new ListNode(num));
        }
        Solution3 solution3 = new Solution3();
        solution3.heapSort(lists);
        for (ListNode list: lists) {
            System.out.println(list.val);
        }
    }

    public static void swap(List<ListNode> lists, int index1, int index2) {
        ListNode temp = lists.get(index1);
        lists.set(index1, lists.get(index2));
        lists.set(index2, temp);
    }
}
