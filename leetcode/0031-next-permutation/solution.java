class Solution {

    // Swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse elements from index 'left' to 'right'
    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {

        // Example: nums = [2,1,5,4,3,0,0]
        int n = nums.length;
        int index = -1;

        // STEP 1: Find the breakpoint (first decreasing element from right)

        // Start from second last index:
        // Compare:
        // 0 < 0 → false
        // 3 < 0 → false
        // 4 < 3 → false
        // 5 < 4 → false
        // 1 < 5 → TRUE  ← breakpoint found at index = 1

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;   // index = 1 (value = 1)
                break;
            }
        }

        // If no breakpoint, reverse entire array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // STEP 2: Find next greater element from right side
        // We need element just greater than nums[index] (which is 1)

        // Traverse from right:
        // 0 > 1 → false
        // 0 > 1 → false
        // 3 > 1 → TRUE

        // So we swap 1 and 3

        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // After swap:
        // [2,3,5,4,1,0,0]

        // STEP 3: Reverse the suffix (index+1 to end)
        // Reverse from index 2 to 6

        // Before reverse:
        // [5,4,1,0,0]  (this part is descending)

        // After reverse:
        // [0,0,1,4,5]

        reverse(nums, index + 1, n - 1);

        // Final result:
        // [2,3,0,0,1,4,5]
    }
}
