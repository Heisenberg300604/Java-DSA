class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length; 

        int maxVal = Integer.MIN_VALUE;

        int i = 0 ;
        int j = i+k; // j - i >= k
        int bestLeft = Integer.MIN_VALUE;
        
        while(j < n){

            bestLeft = Math.max(bestLeft , nums[j-k]);
            int currVal = bestLeft + nums[j];
            
            maxVal = Math.max(currVal , maxVal);
            j++;
        }

        return maxVal;
    }
}
