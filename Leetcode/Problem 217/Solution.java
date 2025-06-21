class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Using HashMap to store the elements
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        HashMap<Integer,Boolean> map = new HashMap<>();
        // Iterating through the array
        // If the element is already present in the map, return true
        // If the element is not present, add it to the map
        // If the element is already present, it means there is a duplicate
        // If the element is not present, it means there is no duplicate
        for(int num:nums){
            if(map.containsKey(num)){ // .containsKey() checks if the key is present in the map
                return true;
            }
            else{
                map.put(num,true); // .put() adds the key-value pair to the map
            }
        }     
        return false;
    }
}