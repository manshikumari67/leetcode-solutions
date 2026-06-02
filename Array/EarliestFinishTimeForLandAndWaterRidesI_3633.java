package Array;

// 3633. Earliest Finish Time for Land and Water Rides I

// You are given two categories of theme park attractions: land rides and water rides.
// Land rides
// landStartTime[i] – the earliest time the ith land ride can be boarded.
// landDuration[i] – how long the ith land ride lasts.
// Water rides
// waterStartTime[j] – the earliest time the jth water ride can be boarded.
// waterDuration[j] – how long the jth water ride lasts.
// A tourist must experience exactly one ride from each category, in either order.
// A ride may be started at its opening time or any later moment.
// If a ride is started at time t, it finishes at time t + duration.
// Immediately after finishing one ride the tourist may board the other (if it is already open) or wait until it opens.
// Return the earliest possible time at which the tourist can finish both rides.

public class EarliestFinishTimeForLandAndWaterRidesI_3633 {
   private int calFinishTime(int[] ls, int[] ld,int[] ws, int[] wd) {

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < ls.length; i++) {
            mini = Math.min(mini, ls[i] + ld[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < ws.length; i++) {
            ans = Math.min(
                ans,
                Math.max(mini, ws[i]) + wd[i]
            );
        }

        return ans;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        return Math.min(
            calFinishTime(landStartTime,landDuration,waterStartTime,waterDuration),
            calFinishTime(waterStartTime,waterDuration,landStartTime,landDuration)
        );
    } 
}
