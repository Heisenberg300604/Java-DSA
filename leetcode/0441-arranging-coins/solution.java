class Solution {
    public int arrangeCoins(int n) {
        int k = 0; // no of staircase
        int row = 1;

        while(n>=row){
            n -= row;
            k++;
            row++;
        }
        
        
        return k;
    }
}
