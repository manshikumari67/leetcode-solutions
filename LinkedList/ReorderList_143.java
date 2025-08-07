package LinkedList;

public class ReorderList_143 {

    // 143. Reorder List

// You are given the head of a singly linked-list. The list can be represented as:
// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:
// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

        //  Reverse the linkedList
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode newHead=reverse(head.next);
        ListNode temp=head.next;
        temp.next=head;
        head.next=null;

        return newHead;
    }

    public void reorderList(ListNode head) {

       if (head == null || head.next == null) return;

     //  finding the  middle Node of LinkedList

       ListNode slow=head;
       ListNode fast=head;

       while(fast.next!=null && fast.next.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
        
        // Reverse the second halfs of list
        ListNode back=reverse(slow.next);
        slow.next=null;

        //  merging the two different halves of ll

         slow=head;
         fast=back;

         while(fast!=null){
             ListNode temp1 = slow.next;
            ListNode temp2 = fast.next;
            slow.next = fast;
            fast.next = temp1;
            slow = temp1;
            fast = temp2;
         }
    }
    
}
