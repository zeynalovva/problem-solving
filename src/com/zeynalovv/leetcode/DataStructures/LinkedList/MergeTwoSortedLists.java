package com.zeynalovv.leetcode.DataStructures.LinkedList;
//
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = null, negro = null;
        while(list1 != null || list2 != null){
            if(list1 == null){
                list = new ListNode(list2.val, list);
                System.out.printf("%d ", list2.val);
                list2 = list2.next;
            }
            else if(list2 == null){
                list = new ListNode(list1.val, list);
                System.out.printf("%d ", list1.val);
                list1 = list1.next;
            }
            else{
                if(list1.val > list2.val){
                    list = new ListNode(list2.val, list);
                    list2 = list2.next;
                }
                else{
                    list = new ListNode(list1.val, list);
                    list1 = list1.next;
                }
            }
            System.out.println();
        }
        while(list != null){
            negro = new ListNode(list.val, negro);
            list = list.next;
        }
        return negro;
    }
}