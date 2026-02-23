// 868. Binary Gap

// Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n. If there are no two adjacent 1's, return 0.
// Two 1's are adjacent if there are only 0's separating them (possibly no 0's). The distance between two 1's is the absolute difference between their bit positions. For example, the two 1's in "1001" have a distance of 3.

 public class BinaryGap_868 {
    public int binaryGap(int n) {
        int maxdist = 0;
        int currdist = 0;
        boolean found = false;
        
        while (n > 0) {
            int bit = n % 2;
            
            if (bit == 1) {
                if (found) {
                    maxdist = Math.max(maxdist, currdist);
                }
                currdist = 1;
                found = true;
            } else {
                if (found) {
                    currdist++;
                }
            }
            
            n /= 2;
        }
        
        return maxdist;
    }
}
