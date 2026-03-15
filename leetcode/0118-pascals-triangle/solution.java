class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0)  return result; // base case
        
        ArrayList<Integer> prev = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for(int j = 1 ; j<=i-1;j++){
                row.add(prev.get(j-1)+prev.get(j));
            }
            if(i > 0){
                row.add(1);
            }
            result.add(row);
            prev = row;
        }
        return result;
    }
}
