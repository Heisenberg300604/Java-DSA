class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }

        int[] t= new int[n+1];

        //t[i] = max stolen money till i house

        // no house ; i = 0
        t[0] = 0;

        // first house 
        t[1] = nums[0];

        for(int i = 2; i<= n ;i++){
            int steal = nums[i-1] + t[i-2]; 
            int skip = t[i-1];

            t[i] = Math.max(steal,skip);
        }

        return t[n];
    }
}
