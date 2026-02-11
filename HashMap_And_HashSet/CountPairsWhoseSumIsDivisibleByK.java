import java.util.HashMap;

public class CountPairsWhoseSumIsDivisibleByK {
    public int countPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int num : arr) {

            int rem = num % k;

            // Handle negative remainder
            if (rem < 0) {
                rem += k;
            }

            int complement = (k - rem) % k;

            // If complement remainder already exists
            if (map.containsKey(complement)) {
                pairs += map.get(complement);
            }

            // Store current remainder
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return pairs;
    }
}
