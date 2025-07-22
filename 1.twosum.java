/*
Explanation:

The outer loop variable i is used to indicate the gap between two indices.

The inner loop variable j is used to test the current index.

For each possible pair of indices (j-i, j), it checks whether their corresponding values sum up to target.

If a match is found, the indices are returned.

If no match is found after all loops, an empty array is returned.

Alternate approach suggestion:
Although your code works correctly, the standard approach to this problem is to use a hash map for O(n) efficiency. If you'd like, I can also comment on or provide an efficient version!

Let me know your next question or if you'd like further improvements!
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Get the length of the input array
        int n = nums.length;
        
        // Outer loop: start from i = 1 up to n-1
        for (int i = 1; i < n; i++) {
            // Inner loop: start from j = i up to n-1
            for (int j = i; j < n; j++) {
                // Check if the sum of nums[j] and nums[j-i] equals the target
                if (nums[j] + nums[j - i] == target) {
                    // If found, return their indices as a new array
                    return new int[]{j - i, j};
                }
            }
        }
        
        // Return an empty array if no such pair is found
        return new int[0];
    }
}
