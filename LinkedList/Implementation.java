package LinkedList;

public class Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {

        Node head = null;
        Node tail = null;
        int size = 0;


     //   Insert the node at the end 

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;               
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

           //   Insert the node at the head
         void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp; // ✅ Fix: set tail when inserting first node
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
         
         //   Insert the node at the any point or index 
        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp=head;
            if(idx==size){
                insertAtEnd(val);
            }
            else if(idx==0){
                insertAtHead(val);
            }else if(idx<0 || idx >size){
                System.out.println("Wrong Index Entered");
                return;
            }

            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
           
            size++;
        }


         //   get element of node by giving its index
        int getIndexElement(int idx){
            Node temp=head;
            if(idx<0 || idx >size){
                System.out.println("Wrong Index Entered");
                return -1;
            }

             for (int i=1;i<=idx;i++){
                temp=temp.next;
            }

            return temp.data;
        }
        
         //   Delete the node at the any index 
        void deleteAt(int idx){
             if(idx==0){
                head=head.next;
                return;
            }
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            
        }

        //   To display the linkedlist
        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(37);
        ll.insertAtEnd(45);
        ll.display();
        ll.insertAtHead(2);
        ll.insertAtHead(100);
        ll.display();
        System.out.println(ll.size);

        ll.insertAt(4, 69);
        ll.display();
        System.out.println(ll.size);
        ll.insertAt(-2, 8);
        ll.display();
        System.out.println(ll.size);

       System.out.println( ll.getIndexElement(3));

       ll.deleteAt(3);
       ll.display();


    }
}