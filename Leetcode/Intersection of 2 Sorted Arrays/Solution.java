import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i =0;
        int j=0;
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> Union = new ArrayList<>();
        // first we will sort the array then two pointer approach
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n && j<m){
            
            if(nums1[i]==nums2[j]){
                if(Union.size()==0 || Union.get(Union.size()-1) != nums1[i]){
                    Union.add(nums1[i]);
                }
                i++;
                j++;    
            }else if (nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[] result = new int[Union.size()];
        for (int k = 0; k < Union.size(); k++) {
            result[k] = Union.get(k);
        }
        return result;
    }
}