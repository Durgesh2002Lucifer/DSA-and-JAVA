class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currsum = 0, maxsum = nums[0];
        int currmin = 0, minsum = nums[0];
        int total = 0;
        for(int i=0;i<nums.length;i++){
            currsum = Math.max(nums[i], nums[i]+currsum);
            maxsum = Math.max(currsum, maxsum);

            currmin = Math.min(nums[i], nums[i]+currmin);
            minsum = Math.min(currmin,minsum);

            total += nums[i];
        }
        if(maxsum < 0){
            return maxsum;
        }
        return Math.max(maxsum, total-minsum);
    }
}