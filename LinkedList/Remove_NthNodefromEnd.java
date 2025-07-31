package LinkedList;

// 19.Remove Nth Node from End of the List

// Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class Remove_NthNodefromEnd {

     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

     public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return head;

    }
    
}
