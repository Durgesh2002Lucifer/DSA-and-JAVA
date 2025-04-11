class Solution {
    public int[] productExceptSelf(int[] nums) {
        //BruteForce
       /* int arr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int product = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product *= nums[j];
                }
            }
            arr[i] = product;
            product = 1;
        }
       return arr;*/

      // optimse approach 
      int result[] = new int[nums.length];
      result[0] = 1; // prefix product i ke picche ke elements ka sum
      for(int i=1;i<nums.length;i++){
        result[i] = result[i-1] * nums[i-1];
      }

      int suffix = 1; // calculate suffix i ke aage ke element ka sum
      for(int i=nums.length-1;i>=0;i--){
        result[i] *= suffix;
        suffix *= nums[i];
      }
      return result;
    }
}