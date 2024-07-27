class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length;
        int expectedsum = (sum*(sum+1))/2;
        int actualsum = 0; 
        for(int i=0;i<sum;i++){
            actualsum += nums[i];
        }
        return expectedsum -actualsum;
    }
}
