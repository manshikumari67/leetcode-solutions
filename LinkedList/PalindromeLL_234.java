package LinkedList;

// 234.Palindrome Linked List

// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

public class PalindromeLL_234 {

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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode temp=reverseList(slow.next);
        slow.next=temp;
        ListNode p1=head;
        ListNode p2=slow.next;
        while(p2!=null){
            if(p1.val!=p2.val) return false;

            p1=p1.next;
            p2=p2.next;
        }


       return true;

    }
    
}
