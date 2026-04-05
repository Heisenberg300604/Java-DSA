class Solution {
    public int searchInsert(int[] nums, int target) {
        // revising old topics
        // nums is sorted and we ought to find the index if target found else return index where it would be inserted in order
        int low = 0 ; 
        int high = nums.length-1;
        int ans = nums.length;
        while(high >= low){
            int mid = low + (high-low)/2;
            if(nums[mid] >= target ){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
}
