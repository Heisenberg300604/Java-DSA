class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
            int needed = target - nums[i];
            if(numbers.containsKey(needed)){ // if got the needed number in the HashTable 
                return new int[]{i, numbers.get(needed)};
            }
            numbers.put(nums[i], i); // store number and the index value
        }
        return new int []{-1,-1};
    }
}
