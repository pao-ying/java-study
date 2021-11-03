package com.example.code.solution142;

import com.example.code.ListNode;

/*
* 这个题需要一定的数学思想。
* 从链表开始节点到入环开始节点为a
* slow在入环后移动b个位置与fast相遇
* 环的剩余长度为c，即b+c=L，L就是环的总长
* 则满足fast走过的总路程：2(a+b)[2*短指针路程] = a + n(b+c) + c, n就是旋转的圈数
*  => a = (n-1)b + nc
*  => a = (n-1)b + (n-1)c + c
*  => a = (n-1)(b+c) + c
*  => a = (n-1)L + c
* 意思就是a的长度就是slow和fast相遇之后，slow走完n圈再加c步后到达环的开始节点
*
* 第二种说法：
* 两指针相遇时：
* f = 2s
* f = s + nL
* => s = nL
* 从head走到环点，可以走 a + nL，又s已经走了nL，则s再走a步即可到达环点，又因为head走a步也会到环点，所以s与head相遇即可。
* */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head, startNode = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (startNode != slow) {
                    startNode = startNode.next;
                    slow = slow.next;
                }
                return startNode;
            }
        }
        return null;
    }
}
