class Solution {
    private int searching(int[] nums, int target , int start, int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return searching(nums,target,start,mid-1);
        }else{
            return searching(nums,target,mid+1,end);
        }
    }
    public int search(int[] nums, int target) {
        int n = nums.length-1;
        return searching(nums,target, 0, n);
        
    }
}
