package BasicMaths;

// 9. Palindromic Number

// Given an integer x, return true if x is a palindrome, and false otherwise.

public class PalindromicNumber_9 {
     public boolean isPalindrome(int x) {
     
     int y=x;
     int p=0;
     while(y>0){
        int dig=y%10;
        p=p*10+dig;
        y=y/10;
     }

     if(x==p) return true;

     return false;

    }
}
