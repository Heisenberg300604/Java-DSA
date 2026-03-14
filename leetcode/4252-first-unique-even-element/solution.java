class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && freq.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}
