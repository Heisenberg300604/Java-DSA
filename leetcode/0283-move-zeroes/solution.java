class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            // if element is non-zero
            if(nums[i]!= 0 ){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp; // swap the elements
                j++;
            }
        }
    }
}
