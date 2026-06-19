package Array;

// 1732. Find the Highest Altitude

// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.


public class FindTheHighestAltitude_1732 {
    public int largestAltitude(int[] gain) {
        int maxHeight = 0;
        int currHeight = 0;

        for (int g : gain) {
            currHeight += g;
            maxHeight = Math.max(maxHeight, currHeight);
        }

        return maxHeight;
    }
}
