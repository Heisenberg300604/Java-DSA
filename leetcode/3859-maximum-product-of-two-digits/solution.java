class Solution {
    public int maxProduct(int n) {
        int maxProd = Integer.MIN_VALUE ;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(n > 0){
            int x = n%10;
            arr.add(x);
            n = n/10;
        }

        for(int i = 0 ; i < arr.size() ; i++){
            for(int j = i+1 ; j < arr.size() ; j++){
                maxProd = Math.max(arr.get(i) * arr.get(j) , maxProd);
            }
        }
        return maxProd;
    }
}
