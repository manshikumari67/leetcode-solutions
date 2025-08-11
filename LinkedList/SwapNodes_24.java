package LinkedList;

// 24.Swap Nodes in Pairs

// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

public class SwapNodes_24 {

     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }



      public ListNode swapPairs(ListNode head) {

        ListNode extra=new ListNode(0);
        extra.next=head;

        ListNode p1=extra;
        ListNode p2=head;

        while(p2!=null && p2.next!=null){
            ListNode slow=p2.next;
            ListNode fast=p2.next.next;

            slow.next=p2;
            p2.next=fast;
            p1.next=slow;

            p1=p2;
            p2=fast;
        }

        return extra.next;
    }
    
}
