package BackTracking;

import java.util.ArrayList;
import java.util.List;

// 216. Combination Sum III

// Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

public class CombinationSumIII_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(k, 1, n, new ArrayList<>(), ans);
        return ans; 
    }

    public static void findCombination(int k, int num, int target, ArrayList<Integer> lst, List<List<Integer>> ans) {
        // If target is reached and k elements are used
        if (target == 0 && k == 0) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        for (int i = num; i < 10; i++) {
            if (i > target || k <= 0) break; // Prune unnecessary calls
            lst.add(i); // Choose the current number
            findCombination(k - 1, i + 1, target - i, lst, ans); // Recurse
            lst.remove(lst.size() - 1); // Backtrack
        }
    }
}
