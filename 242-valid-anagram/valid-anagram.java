class Solution {
    public boolean isAnagram(String s, String t) {
        // tatti question
        char temp1[] = s.toCharArray();
        char temp2[] = t.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        String str = new String(temp1);
        String str1 = new String(temp2);
       
        if(str.equals(str1)){
            return true;
        }
        return false;
    }
}