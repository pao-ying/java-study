package com.example.code.solution206;


import com.example.code.ListNode;

public class MyLink {
    ListNode head;

    public void addNode(int d) {
        ListNode node = new ListNode(d);
        if (head == null) {
            head = node;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 2;
        ListNode preNode = head;
        ListNode curNode = head.next;
        while (curNode != null) {
            if (index == i) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i ++;
        }
        return false;
    }

    // 不知道头指针的情况下删除指定节点(若是最后一个节点则无法删除)
    public boolean deleteNode2(ListNode node) {
        if (node == null || node.next == null) {
            return false;
        }
        node.val = node.next.val;
        node.next = node.next.next;
        return true;
    }

    public int length() {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length ++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {
        MyLink myLink = new MyLink();
        myLink.addNode(1);
        myLink.addNode(2);
        myLink.addNode(3);
//        myLink.printList();
        myLink.deleteNode(2);
        myLink.printList();
    }
}
