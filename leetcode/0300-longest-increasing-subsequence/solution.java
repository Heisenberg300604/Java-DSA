class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] t = new int[n];
        Arrays.fill(t, 1); // every array element has LIS of 1 rn..
        // global variable to store the maxLIS
        int maxLIS = 1;
        /// Compare nums[i] with every previous element
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ;j++){
                if(nums[j] < nums[i]){
                    t[i] = Math.max(t[i] , t[j] + 1);
                    maxLIS = Math.max(t[i] , maxLIS);
                }
            }
        }
        return maxLIS;
    }
}
