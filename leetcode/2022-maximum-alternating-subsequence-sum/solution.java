class Solution {
    public long solve(int index, boolean flag, int[] nums, long[][] dp) {
        if (index == nums.length) {
            return 0; // base case
        }

        int f = flag ? 1 : 0;

        if (dp[index][f] != -1) {
            return dp[index][f];
        }

        long skip = solve(index + 1, flag, nums,dp);

        long val = nums[index];

        if (flag != true) {
            val = -val;
        }

        long take = solve(index + 1, !flag, nums,dp) + val;

        return dp[index][flag ? 1:0] = Math.max(take, skip);
    }

    public long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length + 1][2];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, true, nums,dp);
    }
}
