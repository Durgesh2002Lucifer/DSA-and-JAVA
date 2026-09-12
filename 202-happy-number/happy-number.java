class Solution {

    public int DigitSquareSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n%10;
            sum += digit*digit;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();        
        if(n == 1){
           return true;
        }         
        while(n != 1){
            int a = DigitSquareSum(n);
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else if(map.get(a) > 1){
                return false;
            }
            else{
                map.put(a,map.get(a)+1);
            }
            n = a;
        }
    return true;
    }
}