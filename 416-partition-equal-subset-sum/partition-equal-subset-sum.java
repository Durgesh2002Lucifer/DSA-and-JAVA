class Solution {
    
    // recursive approach
    /*public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2 == 0){
            sum= sum/2;
        }
        else{
            return false;
        }

        return checksum(nums,sum,0);
       
    }

     public boolean checksum(int[] nums,int target, int index){
        if(target == 0){
            return true;
        }
        if(target < 0 || index >= nums.length){
            return false;
        }
       
        boolean include = checksum(nums,target-nums[index],index+1);
        boolean exclude = checksum(nums,target,index+1);
        return include || exclude;
    }*/
    
    // memoization
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum%2 == 0){
            sum= sum/2;
        }
        else{
            return false;
        }
        
        int dp[][] = new int[sum+1][nums.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return checksum(nums,sum,0,dp);
       
    }

     public boolean checksum(int[] nums,int target, int index, int[][] dp){
        if(target == 0){
            return true;
        }
        if(target < 0 || index >= nums.length){
            return false;
        }

        if(dp[target][index]!= -1){
            return dp[target][index] == 1;
        }

        boolean include = false;

         if(target>=nums[index]){
             include = checksum(nums,target-nums[index],index+1,dp);
         }
        
         boolean exclude = checksum(nums,target,index+1,dp);


        boolean res = include||exclude;
        if(res == true){
            dp[target][index] = 1;
        }
        else{
            dp[target][index] = 0;
        }
       return res;
    }
}