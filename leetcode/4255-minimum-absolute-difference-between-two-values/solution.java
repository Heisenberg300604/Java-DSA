class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int i = -1 ;
        int j = -1 ;
        int min = Integer.MAX_VALUE;
        for(int k = 0 ; k < nums.length ; k++){
            if(nums[k] == 1){
                i = k;
            }
            else if(nums[k] == 2){
                j = k;
            }
            if(i != -1 && j!= -1){
                min = Math.min(min, Math.abs(i-j));
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
