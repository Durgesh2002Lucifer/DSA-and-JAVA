class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String str = String.join("",word1);
        String str1 = String.join("",word2);
        
        if(str.length() != str1.length()){
            return false;
        }
        
        return str.equals(str1);
    }
}