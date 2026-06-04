class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m+n-1; // nums1 array ke last mai rahega ye pointer 
        int i = n-1; // nums2 array ke last mai rahega ye wala pointer
        int k = m-1; // nums 1 array ke largest element pe rahega ye pointer
        while(i >= 0 && k >= 0){
            if(nums2[i] > nums1[k]){
                nums1[j] = nums2[i];
                i--;
            }else{
                nums1[j] = nums1[k];
                k--;
            }
            j--;
        }
        while(i >= 0){
            nums1[j] = nums2[i];
            i--;
            j--;
        }
    }
}
