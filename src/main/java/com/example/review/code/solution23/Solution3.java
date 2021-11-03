package com.example.review.code.solution23;

import com.example.code.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        List<ListNode> newLists = new ArrayList<>();
        for (ListNode list: lists) {
            while (list != null) {
                newLists.add(list);
                list = list.next;
            }
        }
        heapSort(newLists);
        ListNode head = new ListNode();
        ListNode tail = head;
        for (ListNode list: newLists) {
            tail.next = list;
            tail = tail.next;
        }
        tail.next = null;
        return head.next;
    }

    public void heapSort(List<ListNode> lists) {
        for (int i = lists.size() / 2 - 1; i >= 0; i--) {
            adjustHeap(lists, i, lists.size());
        }
        for (int i = lists.size() - 1; i > 0; i--) {
            swap(lists, 0, i);
            adjustHeap(lists, 0, i);
        }
    }

    public void adjustHeap(List<ListNode> lists, int index, int length) {
        for (int k = index * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && lists.get(k + 1).val > lists.get(k).val) {
                k = k + 1;
            }
            if (lists.get(k).val > lists.get(index).val) {
                swap(lists, index, k);
                index = k;
            } else {
                break;
            }
        }
    }

    public void swap(List<ListNode> lists, int index1, int index2) {
        ListNode temp = lists.get(index1);
        lists.set(index1, lists.get(index2));
        lists.set(index2, temp);
    }
}
