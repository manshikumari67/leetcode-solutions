import java.util.HashMap;

public class MostFrequentChar {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Find maximum frequency
        int maxFreq = 0;
        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        // Find character with maximum frequency
        char ans = s.charAt(0);
        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (freq == maxFreq) {
                ans = ch;
                break;  // optional (agar first max chahiye)
            }
        }

        return ans;
    }
}
