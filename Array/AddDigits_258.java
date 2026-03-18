package Array;

// 258. Add Digits

// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

public class AddDigits_258 {
    public int addDigits(int num) {
         if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }
}
