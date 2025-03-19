class Solution {
    public void flip(int[] nums, int pos){

        nums[pos] ^= 1;
        nums[pos+1] ^= 1;
        nums[pos+2] ^= 1;
    }

    public int minOperations(int[] nums) {
       int n= nums.length;
       int flipCount = 0;
       
       for(int i = 0; i<n-2; i++){
        if(nums[i] == 1){
            continue;
        }else{
            flip(nums,i);
            flipCount++;
        }
       }
       if(nums[n-2] == 0 || nums[n-1] == 0){
        return -1;
       }
       return flipCount;
    }
}