class Solution {
    public int helper(int n , int [] dp){
        if(n == 0) return 1;
        if(n < 0) return 0;

        // after checking the base case we need to check our DP array

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = helper(n-1 , dp)+ helper(n-2 , dp); // 1 and 2 step 
    }
    public int climbStairs(int n) {
        // we need to create a DP array
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
}
