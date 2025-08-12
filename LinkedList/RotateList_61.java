package LinkedList;

// 61. Rotate List

// Given the head of a linked list, rotate the list to the right by k places.

public class RotateList_61 {
       public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

      public ListNode rotateRight(ListNode head, int k) {
          if (head == null) return head;

        int length = 1;
        ListNode p1 = head;

        while (p1.next != null) {
            p1 = p1.next;
            length++;
        }

        int position = k % length;
        if (position == 0) return head;

        ListNode temp=head;

        for(int i=0;i<length-position-1;i++){
            temp=temp.next;
        }

        ListNode newHead=temp.next;
        temp.next=null;
        p1.next=head;

        return newHead;
    }

}
