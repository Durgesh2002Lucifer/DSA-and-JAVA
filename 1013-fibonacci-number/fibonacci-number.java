class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
         int[] memo = new int[n + 1];
         Arrays.fill(memo, -1);

       return nthFibonacci(n,memo);
    }

    public int nthFibonacci(int n, int[] memo) {

       if(n <= 1){
        return n;
       }
       if(memo[n] != -1) {
            return memo[n];
        }

        memo[n] = nthFibonacci(n - 1, memo) + nthFibonacci(n - 2, memo);

        return nthFibonacci(n, memo);
    }
}