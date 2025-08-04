package LinkedList;

// 328. Odd Even Linkedlist

// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
// The first node is considered odd, and the second node is even, and so on.
// Note that the relative order inside both the even and odd groups should remain as it was in the input.
// You must solve the problem in O(1) extra space complexity and O(n) time complexity.

public class OddEven_328 {

      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

     public ListNode oddEvenList(ListNode head) {

        // if(head==null || head.next==null){
        //     return head;
        // }
        // ListNode even=head.next;
        // ListNode odd=head;
        // ListNode tempeven=even;
        // ListNode tempodd=odd;

        // while(even!=null && even.next!=null){
        //     odd.next=even.next;
        //     odd=odd.next;
        //     even.next=odd.next;
        //     even=even.next;
        // }
        // odd.next=tempeven;
        // if(even!=null){
        //     even.next=null;
        // }

        // return tempodd;

        ListNode odd=new ListNode(0);
        ListNode even=new ListNode(0);
        ListNode tempo=odd;
        ListNode tempe=even;
        ListNode temp=head;

        while(temp!=null){
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;

             tempe.next=temp;
             if(temp==null) break;
            temp=temp.next;
            tempe=tempe.next;
        }
        
       odd=odd.next;
       even=even.next;
       tempo.next=even;

       return odd;

    }
}
    
