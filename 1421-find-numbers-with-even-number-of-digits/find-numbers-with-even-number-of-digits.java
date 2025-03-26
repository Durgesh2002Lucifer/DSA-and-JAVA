class Solution {
    public int countDigit(int a){
        int count = 0;
     while(a != 0){
       a = a/10;
       count++;
     }
     return count;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(countDigit(nums[i])%2 == 0){
                count++;
            }
        }
        return count;
    }
}