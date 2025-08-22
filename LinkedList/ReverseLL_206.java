package LinkedList;

// 206. Reverse Linked List
// Given the head of a singly linked list, reverse the list, and return the reversed list.


public class ReverseLL_206 {

      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
   }


     public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode after=null;

        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }

        return prev;
    }
    
}
