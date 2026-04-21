
// 137. Single Number II

// Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

public class SingleNumberII_137 {
     public int singleNumber(int[] nums) {
    int ans = 0;

    for (int i = 0; i < 32; ++i) {
      int sum = 0;
      for (final int num : nums)
        sum += num >> i & 1;
      sum %= 3;
      ans |= sum << i;
    }

    return ans;
  }
}
