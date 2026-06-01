class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>(i+1);
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    // upar wala element and then upar ka left ( diagonal ) element !!
                    int num = result.get(i-1).get(j) + result.get(i-1).get(j-1);
                    row.add(num);
                }
            }
            result.add(row);
        }
        return result;
    }
}


