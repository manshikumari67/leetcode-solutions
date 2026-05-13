package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 18. 4Sum

// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

public class Sum4_18 {
     public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int k = j + 1;
                int l = n - 1;

                while(k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum < target) k++;
                    else if(sum > target) l--;
                    else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++; l--;

                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }

        return result;
    }
}
