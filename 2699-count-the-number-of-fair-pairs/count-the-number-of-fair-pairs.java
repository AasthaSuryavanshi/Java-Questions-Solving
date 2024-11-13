import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        // Sort the array to enable binary search for valid pairs
        Arrays.sort(nums);
        long count = 0;

        // Loop through each element to find valid pairs (i, j)
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            // Find the smallest index `j` such that nums[i] + nums[j] >= lower
            int start = lowerBound(nums, left, right, lower - nums[i]);
            // Find the largest index `j` such that nums[i] + nums[j] <= upper
            int end = upperBound(nums, left, right, upper - nums[i]);

            // Add the count of valid pairs for this `i`
            if (start <= end) {
                count += end - start + 1;
            }
        }

        return count;
    }

    // Helper function to find the left bound (smallest index) where nums[i] + nums[j] >= lower
    private int lowerBound(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    // Helper function to find the right bound (largest index) where nums[i] + nums[j] <= upper
    private int upperBound(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
