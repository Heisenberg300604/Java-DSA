class Solution {
    public void helper(int[] nums , List<Integer> ans ,List<List<Integer>> result ){
        if(ans.size() == nums.length){
            result.add(new ArrayList<>(ans));
        }else{
            for(int i = 0 ; i <nums.length;i++){
                if(ans.contains(nums[i])) continue;
                ans.add(nums[i]);
                helper(nums,ans,result);
                ans.remove(ans.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, new ArrayList<>(), result);
        return result;
    }
}
