package String;

// 1189. Maximum Number of Balloons

// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
// You can use each character in text at most once. Return the maximum number of instances that can be formed.

public class MaximumNumberOfBallons_1189 {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];

        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        return Math.min(
            Math.min(count['b' - 'a'], count['a' - 'a']),
            Math.min(count['l' - 'a'] / 2,
            Math.min(count['o' - 'a'] / 2, count['n' - 'a']))
        );
    }
}
