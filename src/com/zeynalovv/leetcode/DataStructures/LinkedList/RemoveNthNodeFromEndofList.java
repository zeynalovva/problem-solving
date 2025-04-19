package com.zeynalovv.leetcode.DataStructures.LinkedList;




class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list = null, list2 = null;
        int size = 0;
        while(head != null){
            list2 = new ListNode(head.val, list2);
            head = head.next;
        }
        while(list2 != null){
            if(size != n-1){
                list = new ListNode(list2.val, list);
            }
            size++;
            list2 = list2.next;
        }
        return list;

    }
}