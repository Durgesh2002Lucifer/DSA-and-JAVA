class Solution {
    public int thirdMax(int[] nums) {
       /* // for first max
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        // for second max
        int max1 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != max){
                if(nums[i] > max1){
                    max1 = nums[i];
                }
            }
        }
        // for third max
        int max2 = Integer.MIN_VALUE;
        if(nums.length >= 3){
        for(int i=0;i<nums.length;i++){
            if(nums[i] < max1 ){
                if(nums[i] > max2){
                    max2 = nums[i];
                }
            }
        }
        } 
        if(max1 == max2){
            return max;
        }
        if(nums.length <3){
            return max;
        }
        return max2;*/

        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int count = 0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] != max){
                count++;
                max = nums[i];
            }
            if(count==2){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}