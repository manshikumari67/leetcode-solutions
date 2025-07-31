package LinkedList;

// LeetCode Question

// 237.Delete Node in a linked List

// Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]
// Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class delete_Node237 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public void deleteNode(ListNode node) {

        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}