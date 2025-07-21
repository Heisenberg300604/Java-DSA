// best solution to 2 sum problem 

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // using hashmaps
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            int complement = target -nums[i];
            if(numbers.containsKey(complement)){
                return new int[] {numbers.get(complement),i};
            }
            numbers.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
