package BasicMaths;

// Count all Digits of a Number

// You are given an integer n. You need to return the number of digits in the number.
// The number will have no leading zeroes, except when the number is 0 itself.

public class CountAllDigitsOfNumber {
     public int countDigit(int n) {
        if (n == 0) return 1;
        
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
