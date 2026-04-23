package BasicMaths;

// Check if the Number is ArmStrong

// You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

public class CheckIfTheNumberIsArmStrong {
    public boolean isArmstrong(int n) {
        int original = n;
        int digits = 0;
        
        // count digits
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = n;

        // calculate sum of powers
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }
}
