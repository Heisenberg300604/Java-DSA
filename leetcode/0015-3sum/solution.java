class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // sort the ArrayList

        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0 ; i < n-2 ; i++){
            int j = i+1;
            int k = n-1;
            while(k> j){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0 ){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
