class Solution {
    double solve(double x, long n){
        if(n==0) return 1;

       if(n==1) return x; 
       if(n<0){
        return Math.pow(1/x,-n);
       }
      double half = Math.pow(x,n/2);
      if(n%2 == 0){
        return half*half;
      }else{
        return half*half*x;
      }
    }  
    public double myPow(double x, int n) {
       
       return solve(x,(long)n);
      
    }
}