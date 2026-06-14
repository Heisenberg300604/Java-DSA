class Solution {
    public int fibonnaci(int n , int[] dp){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n]; 
        }
        return dp[n] = fibonnaci(n-1 , dp) + fibonnaci(n-2,dp);
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        return fibonnaci(n , dp);
    }
}
