class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n = nums.length;
        int[] range = new int[n];
        for( int i = 0; i<n; i++ ){
            int sum = 0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    sum++;
                }
            }
            range[i] = sum;
        }
        return range;
    }
}
