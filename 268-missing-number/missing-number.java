class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int currsum = 0;
        for(int i=0;i<nums.length;i++){
          sum += nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            currsum += i;
        }
        return currsum-sum;
    }
}