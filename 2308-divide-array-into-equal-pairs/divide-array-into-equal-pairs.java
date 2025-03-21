class Solution {
    public boolean divideArray(int[] nums) {
       
       // sorting approach easy
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i] != nums[i+1]){
                return false;
            }
        }
        return true;
    }
}