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
     int n = nums.length;
        for(int i = 1;i<n;i++){
            for(int j = i;j<n;j++){
                if(nums[j] + nums[j-i] == target){
                    return new int[]{j-i, j};
                }
            }
        }
        return new int[0];
    }
} 
