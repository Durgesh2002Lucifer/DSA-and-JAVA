class Solution {
    public int countPrimes(int n) {
        /*int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){         // bruteforce approach gives tle
                count++;
            }
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n==0 || n==1){

            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;*/
        //
    boolean[] isPrime = new boolean[n+1];
    Arrays.fill(isPrime,true);
    int count = 0; 
    for(int i=2;i<n;i++){
        if(isPrime[i]){
            count++;
            for(int j=i*2;j<n;j=j+i){
                isPrime[j] = false;
            }
        }
    }
    return count;
    }
}