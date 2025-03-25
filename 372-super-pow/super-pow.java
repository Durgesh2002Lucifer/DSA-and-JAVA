import java.math.BigInteger;

class Solution {
    public int superPow(int a, int[] b) {
        // Convert array `b` into a BigInteger exponent
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b.length; i++) {  
            sb.append(b[i]);  
        }
        
        // Convert the exponent to BigInteger
        BigInteger exponent = new BigInteger(sb.toString());
        BigInteger base = BigInteger.valueOf(a);
        
        // Compute base^exponent % 1337 correctly
        BigInteger result = base.modPow(exponent, BigInteger.valueOf(1337));

        // Convert to int safely
        return result.intValue();  
    }
}
