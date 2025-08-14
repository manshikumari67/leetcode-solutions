package LinkedList;

// 148.Sort List

// Given the head of a linked list, return the list after sorting it in ascending order.

public class SortList_148 {
     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

   private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }



    public ListNode sortList(ListNode head) {

         if (head == null || head.next == null) return head;
        
        // Find the middle of the list
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Split the list
        ListNode mid = slow.next;
        slow.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return merge(left, right);
        
    }
}
