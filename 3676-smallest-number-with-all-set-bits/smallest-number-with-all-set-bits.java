class Solution {

    public int smallestNumber(int n) {
        int i = 1;
        while(true){
            int x = (int)Math.pow(2,i) - 1;
            if(x >= n){
                return x;
            }
            i++;
        }
    }
}