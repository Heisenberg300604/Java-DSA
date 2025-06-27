class Solution {
    // Leetcode Problem 26: Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int k = nums.length;
        // Two pointers approach
        // i is the slow pointer, j is the fast pointer
        // i points to the last unique element, j scans through the array
        // If nums[i] != nums[j], it means we found a new unique element
        // We increment i and set nums[i] to nums[j]
        // At the end, i will point to the last unique element, and we return i
        // + 1 because we want the count of unique elements, not the index
        int i=0;
        for(int j=1;j < k;j++){
            if(nums[i]!= nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}