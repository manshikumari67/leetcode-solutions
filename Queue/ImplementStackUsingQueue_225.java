package Queue;
import java.util.LinkedList;
import java.util.Queue;

// 225. Implement Stack using Queue

// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
// Implement the MyStack class:
// void push(int x) Pushes element x to the top of the stack.
// int pop() Removes the element on the top of the stack and returns it.
// int top() Returns the element on the top of the stack.
// boolean empty() Returns true if the stack is empty, false otherwise.

public class ImplementStackUsingQueue_225 {

    class MyStack {
    Queue<Integer> q=new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x); 
    }
    
    public int pop() {
         for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.remove();
        

         return val;
    }
    
    public int top() {
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.peek();
         q.add(q.remove());

         return val;
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        else return false; 
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}