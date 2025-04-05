class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int totalSubsets = 1 << n; // 2^n subsets

        for (int mask = 0; mask < totalSubsets; mask++) {
            int xor = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    xor ^= nums[i];
                }
            }
            sum += xor;
        }

        return sum;
    }
}
