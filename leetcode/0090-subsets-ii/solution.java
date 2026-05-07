class Solution {
    public void backtrack(int[] nums ,List<List<Integer>> result , List<Integer> set , int index){
        result.add(new ArrayList<>(set));
        for(int i = index ; i < nums.length ;i++){
            if( i != index && nums[i] == nums[i-1]) continue;
            set.add(nums[i]);
            backtrack(nums , result , set , i+1);
            set.remove(set.size() -1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack( nums , result , new ArrayList<>() , 0);
        return result;
    }
}
