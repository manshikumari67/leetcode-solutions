package DP;

import java.util.ArrayList;
import java.util.Arrays;

// 354. Russian Doll Envelopes

// You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
// One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.
// Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).

public class RussainDollEnvelopes_354 {
    public int maxEnvelopes(int[][] envelopes) {
      Arrays.sort(envelopes, (a, b) -> 
            (a[0] != b[0]) ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1])
        );

        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] a : envelopes) {
            int ele = a[1];

            if (ans.size() == 0 || ele > ans.get(ans.size() - 1))
                ans.add(ele);
            else
                replace(ele, ans);
        }

        return ans.size();
    }

    public void replace(int ele, ArrayList<Integer> ans) {
        // find the lower bound
        int lo = 0, hi = ans.size() - 1, lb = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (ans.get(mid) >= ele) {
                lb = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        ans.set(lb, ele);   
    }
}
