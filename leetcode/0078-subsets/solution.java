class Solution {
    public void generateSubsets(List<List<Integer>> result ,List<Integer> temp , int index , int n ,int[] nums ){
        if(index == n){
            result.add(new ArrayList<>(temp));
            return;
        }
        generateSubsets(result , temp , index +1 ,n , nums); // dont include
        temp.add(nums[index]);
        generateSubsets(result , temp , index +1 ,n , nums); // after include
        temp.remove(temp.size() -1);  // We add an element, explore, then remove it to try other possibilities
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateSubsets(result , temp , 0 ,n ,nums );
        return result;
    }
}
