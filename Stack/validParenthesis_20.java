package Stack;
import  java.util.*;

// 20. Valid Parenthesis

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

public class validParenthesis_20 {

    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();

         for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' ||  ch=='{'  ||  ch=='['){
                st.push(ch);
            }
            else if(st.size()>0){
            if(ch==')'){
                if(st.peek()=='(') st.pop();
                else return false;
            }
            if(ch=='}'){
                if(st.peek()=='{') st.pop();
                else return false;
            }
            if(ch==']') {
                if(st.peek()=='[') st.pop();
                else return false;
            }
        }
            else return false;
         }

         if(st.size()>0) return false;
         else return true;

    }
    
}
