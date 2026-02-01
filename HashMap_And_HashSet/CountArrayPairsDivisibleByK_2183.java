
// Count Array Pairs Divisible By K

// Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) such that:
// 0 <= i < j <= n - 1 and
// nums[i] * nums[j] is divisible by k.
 

class CountArrayPairsDivisibleByK_2183 {
    public long countPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long pairs = 0;

        for (int num : nums) {

            int g = gcd(num, k);

            for (int key : map.keySet()) {
                if ((long) g * key % k == 0) {
                    pairs += map.get(key);
                }
            }

            map.put(g, map.getOrDefault(g, 0) + 1);
        }

        return pairs;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
