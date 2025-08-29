package Stack;
import java.util.Stack;

// Basics How to use Stack and how to display reverse stack


public class StacksBasics {

    public static void displayRev( Stack<Integer> st){
        if(st.size()==0) return ;

        int top=st.pop();
        System.out.print(top+" ");
        displayRev(st);
        st.push(top);
    }
     
    public static void pushAtBottom(Stack<Integer> st ,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }

        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st ){
         if(st.size()==1) return;
         int top=st.pop();
         reverseStack(st);
         pushAtBottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // System.out.println();
        // displayRev(st);
        reverseStack(st);
        System.out.println(st);

    }
    
}
