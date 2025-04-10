class Solution {
    public int minOperations(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int h = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                return -1;
            }
            if (nums[i] == k) {
                h = 1;
            }
        }
        return set.size() - h;
    }
}