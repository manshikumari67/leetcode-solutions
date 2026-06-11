package BasicMaths;

// 263. Ugly Number

// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
// Given an integer n, return true if n is an ugly number.

public class UglyNumber_263 {
    public boolean isUgly(int n) {
        if(n == 0)
            return false;
        if(n == 1)
            return true;
        
        while(n%2 == 0)
            n=n/2;
        while(n%3 == 0)
            n=n/3;
        while(n%5 == 0)
            n=n/5;
        if(n != 1)
            return false;
        
        return true;
    }
}
