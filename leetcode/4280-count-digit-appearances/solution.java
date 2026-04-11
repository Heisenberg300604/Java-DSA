class Solution {
    public int countnums(int n , int digit ){
        int count = 0;
        while(n != 0){
            int d = n%10;
            if(d == digit){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i = 0 ; i < nums.length ;i++){
            count+=countnums(nums[i],digit);
        }
        return count;
    }
}
