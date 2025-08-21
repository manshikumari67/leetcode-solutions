package LinkedList;

// 1669. Merge In Between Linked List

// You are given two linked lists: list1 and list2 of sizes n and m respectively.
// Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
// The blue edges and nodes in the following figure indicate the result:
// Build the result list and return its head.

 

public class MergeInBtnLL_1669 {

     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
          ListNode prev = list1;
        ListNode after = list1;
        
        // Move prev to node just before 'a'
        for (int i = 0; i < a - 1; i++) {
            prev = prev.next;
        }
        // Move after to node just after 'b'
        for (int i = 0; i <= b; i++) {
            after = after.next;
        }
        
        // Find tail of list2
        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }
        
        // Connect lists
        prev.next = list2;
        tail.next = after;
        
        return list1;
    }
    
}
