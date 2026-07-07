class Solution {
    public boolean solve(int ind, int[] arr , int target , int[][] dp ) {
        if(target == 0){
            return true;
        }

        if(ind == 0){
            return arr[0] == target;
        }

        if(dp[ind][target] != -1){
            return dp[ind][target] == 1; // true or false return krna hai 
        }

        boolean notTaken = solve(ind-1 , arr , target,dp);
        boolean taken = false;

        if(arr[ind] <=target){
            taken = solve(ind-1 , arr , target -arr[ind], dp);
        }

        dp[ind][target] = (taken || notTaken) ? 1 : 0;

        return dp[ind][target] == 1;
        
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ;i++){
            sum+= nums[i];
        }

        if(sum%2 != 0){
            return false;
        }

        int target = sum/2;

        int[][] dp = new int[n][target+1];
        for (int[] row : dp) {
        Arrays.fill(row, -1);
    }

        return solve(n-1 , nums, target , dp);
    }
}
