class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num=0; num<nums.length;num++){
            if(even(nums[num])){
                count++;
            }
        }
        return count;

    }

    public int numofdigits(int num){
            int count=0;
            while(num>0){
                count++;
                num = num/10;
            }
            return count;
        }

    public boolean even(int num){
            int numberofevendigits = numofdigits(num);
            return numberofevendigits%2==0;
        }
}
