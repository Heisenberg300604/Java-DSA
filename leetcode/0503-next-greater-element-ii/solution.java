class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        // we need to simulate a circular array by iterating twice
        for(int i = 2*n-1 ; i >= 0 ; i--){
            int ind = i % n;
            while(!stack.isEmpty() && nums[ind] >= stack.peek()){
                stack.pop();
            }
            if(i < n){
                if(stack.isEmpty()){
                    ans[ind] = -1;
                }else{
                    ans[ind] = stack.peek();
                }
            }
            stack.push(nums[ind]);
        }
        return ans;
    }
}
