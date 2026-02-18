package Heaps;

import java.util.List;
import java.util.PriorityQueue;

// 632. Smallest Range Covering Elements from k Lists

// You have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one number from each of the k lists.
// We define the range [a, b] is smaller than range [c, d] if b - a < d - c or a < c if b - a == d - c.

public class SmallestRangeCoveringElementsfromkLists_632 {
     class Triplet implements Comparable<Triplet> {

        int val;
        int row;
        int col;

        Triplet(int v, int r, int c) {
            val = v;
            row = r;
            col = c;
        }

        public int compareTo(Triplet t) {
            return this.val - t.val;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {
         PriorityQueue<Triplet> pq = new PriorityQueue<>();

        int max = Integer.MIN_VALUE;

        // first element of each list
        for (int i = 0; i < nums.size(); i++) {

            int val = nums.get(i).get(0);

            pq.add(new Triplet(val, i, 0));

            max = Math.max(max, val);
        }

        int start = 0;
        int end = Integer.MAX_VALUE;

        while (true) {

            Triplet t = pq.remove();

            int min = t.val;

            if (max - min < end - start) {

                start = min;
                end = max;
            }

            if (t.col + 1 == nums.get(t.row).size())
                break;

            int next = nums.get(t.row).get(t.col + 1);

            pq.add(new Triplet(next, t.row, t.col + 1));

            max = Math.max(max, next);
        }

        return new int[]{start, end};
    }
}
