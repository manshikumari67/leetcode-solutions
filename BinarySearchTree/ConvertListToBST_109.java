
// 109. Convert Sorted List To Binary Search Tree

// Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class ConvertListToBST_109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return build(head, null);
    }

    private TreeNode build(ListNode head, ListNode tail) {
        if (head == tail) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is mid
        TreeNode root = new TreeNode(slow.val);

        root.left = build(head, slow);
        root.right = build(slow.next, tail);

        return root;
    }
}
