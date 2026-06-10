class Solution {
    public void swap(int left , int right, int[] nums){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void reverse(int left , int right , int[] nums){
        while(right > left){
            swap(left, right , nums);
            right--;
            left++;
        }
    }
    public void nextPermutation(int[] nums) {
        int bp = -1;
        // identify breakpoint i.e the rightmost element that is smaller than right elements
        for(int i = nums.length-2 ; i >= 0 ;i--){
            if(nums[i] < nums[i+1] ){
                bp = i;
                // index dhoondne ke baad break the loop
                break;
            }
        }

        // if bp is still -1 then we have reached the last permutation
        if(bp == -1){
            reverse(0 , nums.length-1 , nums);
            return ;
        }

        // find the smaller element on the right
        for(int i = nums.length-1 ; i > bp ;i--){
            if(nums[i] > nums[bp]){
                swap(i , bp,nums); // agar element chota hua toh just swap btw bp and index
                break;
            }
        }

        // reverse the array
        reverse(bp+1,nums.length-1 , nums);
    }
}
