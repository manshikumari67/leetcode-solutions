import java.util.Arrays;

// 1552. Magnetic Force Between Two Balls

// In universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at position[i], Morty has m balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.

public class MagneticForceBetweenTwoBalls_1552 {
    public int maxDistance(int[] position, int m) {
         Arrays.sort(position);

        int lo = 1;
        int hi = position[position.length - 1] - position[0];
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (canPlace(position, m, mid)) {
                ans = mid;        // possible → try bigger distance
                lo = mid + 1;
            } else {
                hi = mid - 1;     // not possible → reduce distance
            }
        }

        return ans;
    }

    public boolean canPlace(int[] pos, int m, int dist) {
        int count = 1;
        int last = pos[0];

        for (int i = 1; i < pos.length; i++) {
            if (pos[i] - last >= dist) {
                count++;
                last = pos[i];
            }
        }

        return count >= m;
    }
}
