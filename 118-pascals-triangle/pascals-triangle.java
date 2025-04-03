class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0){
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows == 1){
            return result;
        }

        for(int i=1;i<numRows;i++){
            // result ke previous element ko (i-1) ko prevRows mai rakh denge
            List<Integer> prevRows = result.get(i-1);
            // row ki starting mai 1 add karenge
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                //middle element ke uppar ke doo j and j+1 element ka sum
                row.add(prevRows.get(j) + prevRows.get(j+1));
            }
            // row ki end mai phir 1 add karenge
            row.add(1);
            // or last mai puri row ko result mai print kar denge
            result.add(row);
            // or yai silsila uh hi chalta jayga jab loop break na hoo.
        }
        return result;
    }
}