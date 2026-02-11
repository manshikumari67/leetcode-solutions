// Floor and Ceil in Sorted Array

// Given a sorted array nums and an integer x. Find the floor and ceil of x in nums. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x. If no floor or ceil exists, output -1.

public class FloorAndCeilSortedArray {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int st = 0;
        int end = nums.length - 1;
        int[] ans = new int[2];
        int floor = -1, ceil = -1;

        while (st <= end) { // changed < to <=
            int mid = st + (end - st) / 2;

            if (x == nums[mid]) {
                ans[0] = nums[mid]; // floor
                ans[1] = nums[mid]; // ceil
                return ans;
            } else if (x > nums[mid]) {
                floor = nums[mid];   // possible floor
                st = mid + 1;        // move right
            } else {
                ceil = nums[mid];    // possible ceil
                end = mid - 1;       // move left
            }
        }

        ans[0] = floor;
        ans[1] = ceil;
        return ans;
    }
}
