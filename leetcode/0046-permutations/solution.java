class Solution {
    public void helper(int[] nums ,List<List<Integer>> answer, List<Integer> path ,boolean[] visited ){
        // defining the base conditon ( when to add in the result arraylist)
        if(path.size() == nums.length){
            answer.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0 ; i < nums.length ;i++){
            if(visited[i]) continue;

            path.add(nums[i]);
            visited[i] = true;

            helper(nums , answer , path ,visited );

            path.remove(path.size()-1);
            visited[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        helper(nums , answer , new ArrayList<>() ,visited );
        return answer;
    }
}
