package LinkedList;

// 147. INSERTION SORT LIST

// Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
// The steps of the insertion sort algorithm:
// Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
// At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
// It repeats until no input elements remain.

public class InsertionSortList_147 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

       public ListNode insertionSortList(ListNode head) {
         ListNode dummy=new ListNode(-1);
        ListNode temp=head;
        while(temp!=null){
            ListNode curr=temp.next;
            ListNode prev=dummy;
            while(prev.next!=null && prev.next.val<=temp.val)
                prev=prev.next;
            temp.next=prev.next;
            prev.next=temp;
            temp=curr;
        }
        return dummy.next;
    }
    
}
