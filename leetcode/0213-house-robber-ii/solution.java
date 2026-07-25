class Solution {
    int[] dp = new int[101];
    private int solve(int[] nums, int i , int n, int[] dp){ // start and end index
        if(i > n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        return dp[i] = Math.max(nums[i] + solve(nums , i+2 , n, dp) , solve(nums , i+1 , n,dp));
    }
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            return Math.max(nums[0] , nums[1]);
        }

        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        // 2 cases banenge yaha par
        // case 1 and 2
        return Math.max(solve(nums , 0 , n-2, dp1 ), solve(nums, 1 , n-1, dp2));
    }
}
