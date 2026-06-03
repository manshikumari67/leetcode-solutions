package Array;

// 3635. Earliest Finish Time for Land and Water Rides II

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


public class EarliestFinishTimeForLandAndWaterRidesII_3635 {
    public int earliestFinishTime(int[] lst, int[] ldu,int[] wst, int[] wdu) {

        int ans = Integer.MAX_VALUE;
        int mln = Integer.MAX_VALUE;
        int mnw = Integer.MAX_VALUE;

        for (int i = 0; i < lst.length; i++)
            mln = Math.min(mln, lst[i] + ldu[i]);

        for (int i = 0; i < wst.length; i++)
            ans = Math.min(ans, Math.max(mln, wst[i]) + wdu[i]);

        for (int i = 0; i < wst.length; i++)
            mnw = Math.min(mnw, wst[i] + wdu[i]);

        for (int i = 0; i < lst.length; i++)
            ans = Math.min(ans, Math.max(mnw, lst[i]) + ldu[i]);

        return ans;
    }
}
