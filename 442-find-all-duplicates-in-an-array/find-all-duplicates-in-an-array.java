class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        /*for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0)
                resultset.add(index+1);
                nums[index]=nums[index]*-1;
            
        }*/
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
           ans.add(nums[j]);
        }
       }
     return ans;
    }
}