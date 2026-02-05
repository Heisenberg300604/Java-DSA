class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 1;
        int n = nums.length;
        if(n < 4) return false;
        // now we can have 3 phases in here first increasing then decreasing and then increasing
        while (i < n && nums[i - 1] < nums[i]) i++;
        if (i == 1) return false;

        int dec = i;
        while (i < n && nums[i - 1] > nums[i]) i++;
        if (dec == i) return false;

        int inc = i;
        while (i < n && nums[i - 1] < nums[i]) i++;
        if (i == inc) return false;

        return i== n;
    }
}
