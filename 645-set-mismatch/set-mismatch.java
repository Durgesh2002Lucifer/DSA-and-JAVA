class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
       
        //cyclic sort
        int i = 0;
        while(i < nums.length){
            
            int correctIndex = nums[i] - 1;
            if(nums[i]>0 && nums[i]<= nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        // check 0+1 = nums[0] || 0+1 = 1
        for(int j = 0;j<nums.length;j++){
          if(j+1 != nums[j]){
            ans[0] = nums[j];
            ans[1] = j+1;
        }
       }
       return ans;
    }
}