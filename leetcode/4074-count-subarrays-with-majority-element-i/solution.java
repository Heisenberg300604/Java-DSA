class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean isMax = false;
            int normal = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                    count++;
                } else {
                    normal++;
                }
                if (count > normal) {
                    maxi++;
                }
            }

        }

        return maxi;
    }
}
