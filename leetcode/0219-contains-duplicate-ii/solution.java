class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        Set<Integer> set =new HashSet<>();
        while(i<n && j<n){
            if(j-i > k){ // shrinking the window
                set.remove(nums[i]);
                i++;
            }
            if(set.contains(nums[j])){ // checking for duplicates
                return true;
            }
            set.add(nums[j]); // adding the elements
            j++;
        }

        return false;
    }
}
