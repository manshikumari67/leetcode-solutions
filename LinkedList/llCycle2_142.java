package LinkedList;

// 142. Linked List Cycle II

// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
// Do not modify the linked list.

public class llCycle2_142 {

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

     public ListNode detectCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
       
       while(fast!=null && fast.next!=null){
        if(slow==null ) return null;
           slow=slow.next;
            
           fast=fast.next.next;
           if(fast==slow) break; 
        }
       if (fast == null || fast.next == null) return null;
        ListNode temp=head;
        while(temp!=slow){
            slow=slow.next;
            temp=temp.next;
        }
       return slow;
    }
    
}
