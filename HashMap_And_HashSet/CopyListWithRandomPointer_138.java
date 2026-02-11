
// 138. Copy List with Random Pointer

// A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

import java.util.HashMap;

class CopyListWithRandomPointer_138{
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node deepCopy(Node head1){
        Node temp1=head1;
        Node head2=new Node(-1);
        Node temp2=head2;
        while(temp1!=null){
            Node t=new Node(temp1.val);
            temp2.next=t;
            temp2=temp2.next;
            temp1=temp1.next;
        }
        return head2.next;
    }
    public Node copyRandomList(Node head) {

        Node b=deepCopy(head);
        HashMap<Node,Node> map=new HashMap<>();
        Node tempA=head;
        Node tempB=b;
        map.put(null,null);
        while(tempA!=null){
            map.put(tempA,tempB);
            tempA=tempA.next;
            tempB=tempB.next;
        }
        tempA=head;
        while(tempA!=null){
            tempB=map.get(tempA);
            tempB.random=map.get(tempA.random);
            tempA=tempA.next;
        }
        return b;
     
    }
}