class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int distinct = set.size();
        
        HashSet<Integer> set1 = new HashSet<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                  set1.add(nums[j]);
                if(set1.size() == distinct){
                    count++;
                }  
            }
            set1.clear();
        }
        return count;
    }
}