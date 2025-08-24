class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] > high) high = nums[i];
        }
        int ans = high;

        while(low <= high){
            int mid = (low + high) / 2;
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += (nums[i] + mid - 1) / mid;
            }

            if(sum <= threshold){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

