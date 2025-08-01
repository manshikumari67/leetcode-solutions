package LinkedList;

// leetcode Question 203

// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

public class RemoveLLElements_203 {

         public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode removeElements(ListNode head, int val) {
       
        while (head != null && head.val == val) {
            head = head.next;
        }

    ListNode temp=head;

    while(temp!=null && temp.next!=null){
        if(temp.next.val==val){
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
    }
        return head;
    }
    
}
