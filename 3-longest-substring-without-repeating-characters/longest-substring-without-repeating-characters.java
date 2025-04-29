class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charset = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        for(int i=0;i<s.length();i++){
            while(charset.contains(s.charAt(i))){
                charset.remove(s.charAt(left));
                left++;
            }
            charset.add(s.charAt(i));
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}