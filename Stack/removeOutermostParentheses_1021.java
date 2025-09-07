package Stack;

// 1021. Remove OuterMost Paranthesis

// A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
// For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
// A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
// Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
// Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

 

public class removeOutermostParentheses_1021 {

     public String removeOuterParentheses(String s) {
        int sum = 0, start = 0, end = 0;
        StringBuilder res = new StringBuilder();

        while (end < s.length()) {
            if (s.charAt(end) == '(') sum++;
            else sum--;

            if (sum == 0) {
                res.append(s.substring(start + 1, end)); // exclude outer
                start = end + 1;
            }
            end++;
        }
        return res.toString();
    }
    
}
