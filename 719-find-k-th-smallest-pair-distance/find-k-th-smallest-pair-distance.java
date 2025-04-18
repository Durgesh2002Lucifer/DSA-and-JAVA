class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int st = 0;
        int end = nums[n-1]-nums[0];

        while(st < end){
            int mid = st + (end-st)/2;
            int count = 0;
            for(int i=0, j=0;i<n;i++){
                while(j<n && nums[j]-nums[i]<=mid){
                    j++;
                }
                count += j-i-1;
            }
            if(count < k){
                st = mid+1;
            }
            else{
                end = mid;
            }
        }
        return st;
    }
}