class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int preNotDeleted = arr[0];
        int preDeleted = 0;
        int max = arr[0];

        for(int i = 1 ; i < n ;i++){
            preDeleted = Math.max(preNotDeleted , preDeleted + arr[i]);
            preNotDeleted = Math.max(arr[i] , preNotDeleted + arr[i]);

            int current = Math.max(preDeleted ,preNotDeleted );

            max = Math.max(current , max);
        }

        return max;
    }
}
