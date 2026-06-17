package String;

// 3614. Process String with Special Operations II

// You are given a string s consisting of lowercase English letters and the special characters: '*', '#', and '%'.
// You are also given an integer k.
// Build a new string result by processing s according to the following rules from left to right:
// If the letter is a lowercase English letter append it to result.
// A '*' removes the last character from result, if it exists.
// A '#' duplicates the current result and appends it to itself.
// A '%' reverses the current result.
// Return the kth character of the final string result. If k is out of the bounds of result, return '.'.

public class ProcessStringWithSpecialOperationsII_3614 {
    public char processStr(String s, long k) {
        long len = 0;

        // Step 1
        for (char c : s.toCharArray()) {
            if (c == '*') len = Math.max(0, len - 1);
            else if (c == '#') len *= 2;
            else if (c != '%') len++;
        }

        if (k >= len) return '.';

        // Step 2
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '*') len++;

            else if (c == '#') {
                long half = len / 2;
                if (k >= half) k -= half;
                len = half;
            }

            else if (c == '%') {
                k = len - 1 - k;
            }

            else {
                if (k == len - 1) return c;
                len--;
            }
        }

        return '.';
    } 
}
