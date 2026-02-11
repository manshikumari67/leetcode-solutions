import java.util.HashMap;

public class ArraySubSet {
    public boolean isSubset(int a[], int b[]) {

        // Frequency map for array a
        HashMap<Integer, Integer> aMap = new HashMap<>();
        for (int ele : a) {
            if (aMap.containsKey(ele)) {
                int freq = aMap.get(ele);
                aMap.put(ele, freq + 1);
            } else {
                aMap.put(ele, 1);
            }
        }

        // Check elements of b in a
        for (int ele : b) {
            if (!aMap.containsKey(ele)) {
                return false;
            } else {
                int freq = aMap.get(ele);
                if (freq == 0) {
                    return false;
                }
                aMap.put(ele, freq - 1);
            }
        }

        return true;
    }
}
