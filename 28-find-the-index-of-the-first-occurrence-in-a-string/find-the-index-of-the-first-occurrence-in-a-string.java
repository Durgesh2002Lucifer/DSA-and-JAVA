class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        StringBuilder sb = new StringBuilder();
       
        for(int i=0;i<=haystack.length()-n;i++){
            String sub = haystack.substring(i,i+n);

            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

