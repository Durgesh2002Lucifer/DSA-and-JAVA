class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        Map.Entry<Integer, Integer> prev = null;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            
            if (prev != null) {
                if (m.getKey() - prev.getKey() == 1) {
                    count++;
                }else{
                    count = 1;
                }
            }else{
                count = 1;
            }
            max = Math.max(count, max);
            prev = m;
        }
        return max;
    }
}