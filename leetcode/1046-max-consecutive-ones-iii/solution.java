class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen =0;
        int zeroes = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zeroes++;
            }
            if(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
            if(k>=zeroes){
                int window = right-left +1;
                maxLen = Math.max(window , maxLen);
            }

            right++;
        }
        return maxLen;
    }
}
