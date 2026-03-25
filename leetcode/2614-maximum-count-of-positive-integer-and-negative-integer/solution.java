class Solution {
    public int firstNonNegative(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]>=0){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }

    public int firstPositive(int[] nums) {
         int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]>0){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }

    public int maximumCount(int[] nums) {
        int neg = firstNonNegative(nums);
        int pos = nums.length - firstPositive(nums);
        return Math.max(neg, pos);
    }
}
