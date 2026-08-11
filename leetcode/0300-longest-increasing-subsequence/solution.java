class Solution {
    public int solve(int i, int prev, int[] nums, int[][] dp) {
        if (i == nums.length) { // base condition 
            return 0;
        }
        // check if already exists in dp array 
        if (dp[i][prev+1] != -1) {
            return dp[i][prev+1];
        }
        // just skip nums[i]
        int skip = solve(i + 1, prev, nums,dp);

        // take nums[i]
        int take = 0;
        // condition to take or skip in here
        if (prev == -1 || nums[i] > nums[prev]) {
            take = 1 + solve(i + 1, i, nums,dp);
        }

        return dp[i][prev+1] = Math.max(take, skip);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][n + 1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return solve(0, -1, nums, dp);
    }
}
