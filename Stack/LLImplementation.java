package Stack;

public class LLImplementation {
    
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }

    public static class LLStack {
    
        Node head=null;
        int size=0;

        void push(int x){
          Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            if(head==null) {
                System.out.println("Stack is Full");
                return -1;
            }

            int x=head.val;
            head=head.next;
            return x;
        }

        int peek(){
            if(head==null) {
                System.out.println("Stack is Full");
                return -1;
            }
            return head.val; 
        }

         void displayrec(Node h){
           if(h==null) return;
           displayrec(h.next);
           System.out.println();
         }

        void display(){
            displayrec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        
    }


    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(4);
         st.display();
        st.push(6);
         st.display();
        st.push(2);
        st.display();
        st.pop();
        st.display();

    }
    
}
