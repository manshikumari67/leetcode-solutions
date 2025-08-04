package LinkedList;

// 83.Remove Duplicate from Sorted Linked List 

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.


public class removeDuplicate_83 {


     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

     public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;

        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }

        return head;
    }
    
}
