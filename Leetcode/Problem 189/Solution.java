// Rotate the elements to the right 

// But this solution would result in TLE not good for big test cases 


// class Solution {
//     public void rotate(int[] nums, int k) {
//         while(k>0){
//         int temp = nums[nums.length-1];
//         for(int i = nums.length-1 ;i>0;i--){
//             nums[i] = nums[i-1];
//         }
//         nums[0]= temp;
//         k--;
//         }
//     }
// }

class Solution {

    public void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        // for (int num : nums)
        //     System.out.print(num + " ");
        // System.out.println();
        k = k % nums.length;
        int n = nums.length;
        reverse(nums, 0, n-k - 1);
        // for (int num : nums)
        //     System.out.print(num + " ");
        // System.out.println();
        reverse(nums, n-k, nums.length - 1);
        // for (int num : nums)
        //     System.out.print(num + " ");
        // System.out.println();
        reverse(nums, 0, nums.length - 1);
        // for (int num : nums)
        //     System.out.print(num + " ");
        // System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Solution sol = new Solution();  // Create an object to call non-static methods
        sol.rotate(arr, k);            

        System.out.print("After rotating the array to the left by k elements: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
