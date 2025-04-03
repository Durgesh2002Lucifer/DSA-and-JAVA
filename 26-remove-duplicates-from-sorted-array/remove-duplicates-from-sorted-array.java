class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       for(int j=1;j<nums.length;j++){
        if(nums[i]<nums[j]){
            nums[i+1] = nums[j];
            i++;
        }
       }
       return i+1;

        /*Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num); // Manually adding each element to the HashSet
        }
        return set.size();*/
    }
}