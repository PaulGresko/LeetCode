package org.example.problem2;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode();
        ListNode temp = resultList;
        int n = 0;
        while (l1 != null && l2 != null) {
            n += l1.val + l2.val;
            temp.next = new ListNode(n % 10);
            n /= 10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            n += l1.val;
            temp.next = new ListNode(n % 10);
            n /= 10;
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            n += l2.val;
            temp.next = new ListNode(n % 10);
            n /= 10;
            temp = temp.next;
            l2 = l2.next;
        }
        if(n!=0){
            temp.next = new ListNode(n);
        }
        return resultList.next;
    }
}
