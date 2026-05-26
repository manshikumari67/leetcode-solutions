import java.util.HashSet;

// 3120. Count the Number of Special Characters I

// You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.
// Return the number of special letters in word.

public class CountTheNumberOfSpecialCharactersI_3120 {
    public int numberOfSpecialChars(String word) {
        
        HashSet<Character> set = new HashSet<>();

        for(char ch : word.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {

            if(set.contains(ch) && set.contains((char)(ch - 'a' + 'A'))) {
                count++;
            }
        }

        return count;
    }
}
