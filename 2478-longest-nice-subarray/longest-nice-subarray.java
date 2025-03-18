class Solution {
    public int longestNiceSubarray(int[] nums) {
       int left = 0;
       int bitmask = 0;
       int maxLen = 0;

       for(int right = 0; right<nums.length;right++){
           while ((bitmask & nums[right]) != 0) {
                bitmask ^= nums[left]; // Remove nums[left] from the bitmask
                left++;
            }

            // Add the new element
            bitmask |= nums[right];

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}