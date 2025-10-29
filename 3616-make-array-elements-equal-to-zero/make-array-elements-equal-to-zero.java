class Solution {
    public int countValidSelections(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }

        for(int i=0;i<nums.length;i++){
            leftsum += nums[i];
            if(nums[i] == 0){
               if(leftsum == (sum - leftsum)){
                ans += 2;
               }
               else if( Math.abs ( leftsum - (sum - leftsum)) == 1 ){
                ans += 1;
               }
            }            
        }
        return ans;
    }
}