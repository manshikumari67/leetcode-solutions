package LinkedList;

// 82.Remove Duplicate from Sorted Linked List 2

// Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

public class RemoveDuplicate_82 {

      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

     public ListNode deleteDuplicates(ListNode head) {

        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                int val=curr.val;

                while(curr!=null && curr.val==val){
                    curr=curr.next;
                }

                if(prev!=null){
                 prev.next=curr;
                }else{
                    head=curr;
                }
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
         return head;
    }
}
