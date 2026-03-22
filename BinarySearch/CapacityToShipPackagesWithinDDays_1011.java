
// 1011. Capacity To Ship Packages Within D Days

// A conveyor belt has packages that must be shipped from one port to another within D days. The i-th package on the conveyor belt has a weight of weights[i]. Each day, we load

public class CapacityToShipPackagesWithinDDays_1011 {
    public int shipWithinDays(int[] weights, int d) {
        int max=Integer.MIN_VALUE, sum=0;
        for(int ele : weights){
            max=Math.max(max,ele);
            sum+=ele;
        }
        int lo=max, hi=sum, ans=-1;
        while(lo<= hi){
            int mid=lo + (hi-lo)/2;
            if(days(mid,weights) <=d){
                hi=mid-1;
                ans=mid;
            }
            else lo=mid+1;
        }
        return ans;
    }

    static int days(int capacity, int[] arr){
        int days=0;
        int c= capacity;
        for(int ele : arr){
            if(c>=ele) c-=ele;
            else{
                days++;
                c=capacity-ele;
            }
        }
        days++;
        return days;
    }
}
