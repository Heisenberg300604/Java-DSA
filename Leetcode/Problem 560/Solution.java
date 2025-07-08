// Used here brute force method here 
// Time complexity of O(n**2)

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i =0; i <nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum = sum+nums[j];
                if(sum ==k){
                    count++;
                }
            }
        }
        return count;
    }
}

// question tells us to return the number of subarrays whose sum is = k