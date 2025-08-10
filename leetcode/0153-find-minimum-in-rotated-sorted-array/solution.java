class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int n = nums.length;
        int high = n-1;
        int mid;
        while(high>=low){
            mid = (high+low)/2;
            if(nums[low]<=nums[mid]){
                if(min>nums[low]){
                    min = nums[low];
                }
                low = mid+1;
            }else{
                if(min>nums[mid]){
                    min = nums[mid];
                }
                high = mid-1;
            }
        }
        return min;
    }
}
