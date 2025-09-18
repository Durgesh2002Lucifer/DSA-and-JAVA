class Solution {
    public boolean isPalindrome(int x) {
        
        int rev = 0, target = x;

        while(x > 0){
            int rem = x%10;
            rev = rev*10 + rem;
            x /= 10;
        }
       if(target == rev){
        return true;
       }
       return false;
    }
}