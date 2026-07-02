class Solution {
    private int helper(int[] arr , int n , int ind , int buy, int[][] dp){
        if(ind == n){
            return 0;
        }
        
        if(dp[ind][buy] != -1){
            return dp[ind][buy];
        }
        int profit = 0;
        if(buy == 1){
            profit = Math.max(-arr[ind] + helper(arr , n , ind+1 , 0, dp),
            0+ helper(arr , n , ind+1 , 1, dp));
        }else{
            profit = Math.max(arr[ind] + helper(arr , n , ind+1 , 1,dp),
            0+ helper(arr , n , ind+1 , 0,dp));
        }
        return dp[ind][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0){
            return 0;
        }
        int[][] dp = new int[n][2];

        for(int[] row : dp){
            Arrays.fill(row , -1);
        }

        return helper(prices , n , 0 , 1 , dp);
    }
}

