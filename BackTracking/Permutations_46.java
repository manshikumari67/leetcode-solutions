package BackTracking;

import java.util.ArrayList;
import java.util.List;

// 46. Permutations

// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

public class Permutations_46 {
     public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        
        permutations(nums, check, temp, ans);
        return ans;
    }

    private void permutations(int[] nums, boolean[] check, List<Integer> temp, List<List<Integer>> ans) {
        
        // base case
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp)); // deep copy
            return;
        }

        // recursion
        for (int i = 0; i < nums.length; i++) {
            if (!check[i]) {
                temp.add(nums[i]);
                check[i] = true;

                permutations(nums, check, temp, ans);

                // backtracking
                temp.remove(temp.size() - 1);
                check[i] = false;
            }
        }
    }
}
