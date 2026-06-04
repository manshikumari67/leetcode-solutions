package String;

// 3751. Total Waviness of Numbers in Range I

// You are given two integers num1 and num2 representing an inclusive range [num1, num2].
// The waviness of a number is defined as the total count of its peaks and valleys:
// A digit is a peak if it is strictly greater than both of its immediate neighbors.
// A digit is a valley if it is strictly less than both of its immediate neighbors.
// The first and last digits of a number cannot be peaks or valleys.
// Any number with fewer than 3 digits has a waviness of 0.
// Return the total sum of waviness for all numbers in the range [num1, num2].

public class totalWavinessOfNumbersInRangeI_3751 {
    private int waviness(int x) {
        String s = Integer.toString(x);

        int cnt = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            char cur = s.charAt(i);

            if ((cur > s.charAt(i - 1) && cur > s.charAt(i + 1)) ||
                (cur < s.charAt(i - 1) && cur < s.charAt(i + 1))) {
                cnt++;
            }
        }

        return cnt;
    }

    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int x = num1; x <= num2; x++) {
            ans += waviness(x);
        }

        return ans;
    }
}
