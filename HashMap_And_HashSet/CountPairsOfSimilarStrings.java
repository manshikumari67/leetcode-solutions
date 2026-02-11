import java.util.HashMap;

public class CountPairsOfSimilarStrings {
     long getPairsCount(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        long pairs = 0;

        // If frequency = f
        // number of pairs = f * (f - 1) / 2
        for (char ch : map.keySet()) {
            long freq = map.get(ch);
            pairs += (freq * (freq - 1)) / 2;
        }

        return pairs;
    }
}
