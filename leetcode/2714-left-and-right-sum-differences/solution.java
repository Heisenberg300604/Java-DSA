class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        
        // build leftSum array
        for(int i = 0 ; i < n ;i++){
            if(i == 0){
                leftSum[0] = 0;
            }else{
                leftSum[i] = nums[i-1] + leftSum[i-1];
            }
        }

        // build rightSum array
        for(int i = n-1 ; i >= 0 ;i--){
            if(i == n-1){
                rightSum[n-1] = 0;
            }else{
                rightSum[i] = nums[i+1] + rightSum[i+1];
            }
        }

        int [] answer = new int[n];
        for(int i = 0 ; i < n ;i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}
