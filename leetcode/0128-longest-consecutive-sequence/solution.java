class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        // put all the numbers in hashset 
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // now iterate over the hashset
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + count)) {
                    count++;
                }
                if (count > max) {
                    max = count;
                }
            }
        }

        return max;
    }
}
