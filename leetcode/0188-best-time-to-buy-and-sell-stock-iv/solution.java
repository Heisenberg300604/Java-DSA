class Solution {
    private int helper(int[] arr, int n, int ind, int buy, int cap, int[][][] dp) {
        if (ind == n || cap == 0) {
            return 0;
        }
        if (dp[ind][buy][cap] != -1) {
            return dp[ind][buy][cap];
        }

        int profit = 0;

        if (buy == 1) {
            profit = Math.max(
                    -arr[ind] + helper(arr, n, ind + 1, 0, cap, dp),
                    0 + helper(arr, n, ind + 1, 1, cap, dp));
        } else {
            profit = Math.max(
                    arr[ind] + helper(arr, n, ind + 1, 1, cap - 1, dp),
                    0 + helper(arr, n, ind + 1, 0, cap, dp));
        }

        return dp[ind][buy][cap] = profit;
    }
    public int maxProfit(int k, int[] prices) {
        int n = prices.length ;

        if(k == 0 || n==0 ){
            return 0;
       }
       int[][][] dp = new int[n][2][k+1];
        for (int[][] matrix : dp) {
            for (int[] row : matrix) {
                Arrays.fill(row, -1);
            }
        }
        return helper(prices, n, 0, 1, k, dp); // arr , len , ind , buy , cap
    }
}
