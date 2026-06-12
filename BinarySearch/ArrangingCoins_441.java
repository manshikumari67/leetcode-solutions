
// 441. Arranging Coins

// You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

public class ArrangingCoins_441 {
     public int arrangeCoins(int n) {
        long left = 1, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coins_needed = mid * (mid + 1) / 2;
            if (coins_needed == n) return (int) mid;
            else if (coins_needed < n) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
    }
}
