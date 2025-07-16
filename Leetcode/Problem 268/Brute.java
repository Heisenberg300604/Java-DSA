import java.util.Arrays;

// does not has good time complexity.. will Exceed Time Limit
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing_number=0;
        Arrays.sort(nums);
        for(int i =0; i <=n;i++){
            int flag = 0;
            for(int j =0; j <n;j++){
                if(nums[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag ==0){
                missing_number= i;
                break;
            }
        }
        return missing_number;
    }
}