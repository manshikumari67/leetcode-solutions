
// Find Nth root of a number

// Given two numbers N and M, find the Nth root of M. The Nth root of a number M is defined as a number X such that when X is raised to the power of N, it equals M. If the Nth root is not an integer, return -1.

public class NthRootOfNumber {
     private long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
            if (result > Integer.MAX_VALUE) // avoid overflow
                return Long.MAX_VALUE;
        }
        return result;
    }

    public int NthRoot(int N, int M) {
         int low = 1, high = M;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long power = power(mid, N); // mid^N

            if (power == M)
                return mid;   // exact integer root found
            else if (power < M)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
