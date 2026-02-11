

// Koko eating bananas

// A monkey is given n piles of bananas, where the 'ith' pile has nums[i] bananas. An integer h represents the total time in hours to eat all the bananas.
// Each hour, the monkey chooses a non-empty pile of bananas and eats k bananas. If the pile contains fewer than k bananas, the monkey eats all the bananas in that pile and does not consume any more bananas in that hour.
// Determine the minimum number of bananas the monkey must eat per hour to finish all the bananas within h hours.


public class KokoEatingBanana {
   public static boolean isEatingSpeed(int[] piles, int speedK, int h){
        int hours=0;
     for(int i=0;i<piles.length;i++){
        hours+=piles[i]/speedK;
        if(piles[i]%speedK !=0){
            hours+=1;
        }
       if(hours>h) return false;
      }
        return true;
    }

    public int minimumRateToEatBananas(int[] nums, int h) {
        int st=1;
      int end=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        end=Math.max(end,nums[i]);
      }  
      int ans=-1;   //apply binary search to the possible values of k.......
      while(st<=end){
        int mid=st+(end-st)/2;
        if(isEatingSpeed(nums,mid,h)){
            ans=mid;
            end=mid-1;
        }else{
            st=mid+1;
        }
      }
      return ans;
   
    }
}