class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        int n = nums.length;
        // detect the cycle first
        slow = nums[slow]; // ek baar move krega
        fast = nums[nums[fast]]; // do baar move krega
        while(slow !=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // move fast and slow pointer 1 time it is guaranteed that they will meet atleast once
        // return the slow or fast pointer

        slow = nums[0]; // entrance of the cycle reset it

        while(slow !=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
