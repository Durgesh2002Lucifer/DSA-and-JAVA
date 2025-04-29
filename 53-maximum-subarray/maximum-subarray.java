class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i] >= 0){
                sum += nums[i];
            }
            else{
                sum = 0;
            }
            if(maxSum < sum){
                maxSum = sum;
            }
        }
        int max = Integer.MIN_VALUE;
        if(maxSum == 0){
            for(int i=0;i<nums.length;i++){
              if(nums[i] > max){
                max = nums[i];
              }
            }
            maxSum = max;
        }
        return maxSum;
    }
}