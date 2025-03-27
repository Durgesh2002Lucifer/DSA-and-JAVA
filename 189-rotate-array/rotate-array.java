class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int ans[] = new int[n];
        int j =0;
        
        for(int i=n-k;i<n;i++){
            ans[j++] = nums[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++] = nums[i];
        }
        // main array mai answer array ko copy karna ha bass 
        for(int i=0;i<ans.length;i++){
            nums[i] = ans[i];
        }
    }
}