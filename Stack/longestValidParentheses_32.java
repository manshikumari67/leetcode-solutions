package Stack;
import  java.util.*;

// 32. Longest Valid Parentheses 

// Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

public class longestValidParentheses_32 {

        public int longestValidParentheses(String s) {
       
    int ans = 0;
    Stack<Integer> st = new Stack<>();
    st.push(-1);

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '(') {
            st.push(i);
        } else {
            st.pop();
            if (st.isEmpty()) {
                st.push(i);
            } else {
                ans = Math.max(ans, i - st.peek());
            }
        }
    }
    return ans;

    }
    
}
