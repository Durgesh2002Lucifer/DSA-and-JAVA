class Solution {
    public int mySqrt(int x) {


       if (x == 0 || x == 1) return x; // Base cases
        
        int low = 1, high = x, ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid; // Avoid overflow
            
            if (square == x)
                return mid; // Perfect square found
            else if (square < x) {
                low = mid + 1;
                ans = mid; // Store possible answer
            } else {
                high = mid - 1;
            }
        }
        
        return ans; // Return the integer square root
    }
}
   