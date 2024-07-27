class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth =0;
        for(int i=0;i<accounts.length;i++){
            int rowsum=0;
            for(int j=0;j<accounts[i].length;j++){
                rowsum += accounts[i][j];
            }
            if(rowsum>maxwealth){
                maxwealth = rowsum;
            }
        }
        return maxwealth;
    }
}
