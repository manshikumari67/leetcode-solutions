package Stack;
import java.util.Stack;

// 682. BaseBall Game

// You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
// You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
// An integer x.
// Record a new score of x.
// '+'.
// Record a new score that is the sum of the previous two scores.
// 'D'.
// Record a new score that is the double of the previous score.
// 'C'.
// Invalidate the previous score, removing it from the record.
// Return the sum of all the scores on the record after applying all the operations.
// The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

public class BaseBallGame_682 {

      public int calPoints(String[] operations) {

         Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int val= st.peek();
                val*=2;
                st.push(val);
            }
            else if(operations[i].equals("+")){
                int val1 = st.pop();
                int val2 = st.pop();
                int sum = val1+val2;
                st.push(val2);
                st.push(val1);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int res = 0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res; 
    }
    
}
