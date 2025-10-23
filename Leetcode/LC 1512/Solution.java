// 1512. Number of Good Pairs

// Problem description - Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0 ;
        int n = nums.length;
        for(int i = 0 ; i<n;i++){
            for( int j = 0; j<n ;j++){
                if(nums[i]== nums[j] && i<j){
                    count +=1;
                }
            }
        }
        return count;
    }
}