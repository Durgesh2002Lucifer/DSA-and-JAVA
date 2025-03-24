class Solution {
    public int[] shuffle(int[] nums, int n) {
       
        int ans[] = new int[n+n];
        int index = 0;
        for(int i=0;i<n;i++){
           
           ans[index] = nums[i];
           index++;
           ans[index] = nums[n+i];
           index++;
        }
    return ans;
    }
}