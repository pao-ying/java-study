package com.example.review.code.solution148;

import com.example.code.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Invoke {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        ListNode.printList(solution.sortList(
                ListNode.makeList2(List.of(-1,5,3,4,0))
        ));
    }
}
