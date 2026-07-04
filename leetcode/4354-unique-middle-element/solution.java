class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int midInd = n/2;

        int count = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == nums[midInd]){
                count++;
            }
            if(count >1){
                return false;
            }
        }

        return true;
    }
}
