class Solution {
    public int thirdMax(int[] nums) {
        int count = 0 ; // to count the distinct third last element to return 
        Arrays.sort(nums);
       
        for(int i = nums.length-1 ; i > 0 ; i-- ){
            if(nums[i-1] != nums[i]){
                count++;
            }
            if(count == 2){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
