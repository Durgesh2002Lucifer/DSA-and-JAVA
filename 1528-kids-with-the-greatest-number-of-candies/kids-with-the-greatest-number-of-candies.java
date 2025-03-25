class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /*List<Boolean> booleanList = new ArrayList<>();
        int maxC = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            
            maxC = Math.max(maxC,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
           
                booleanList.add((candies[i]+extraCandies) >= maxC);
            
        }
        
        return booleanList;*/

        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies) >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}









