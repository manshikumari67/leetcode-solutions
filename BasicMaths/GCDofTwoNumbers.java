package BasicMaths;

// GCD of Two Numbers

// You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.
// The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

public class GCDofTwoNumbers {
     public int GCD(int n1, int n2) {
       while (n2 != 0) {
          int temp = n2;
           n2 = n1 % n2;
           n1= temp;
        }
        return n1;
    }
}
