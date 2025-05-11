class Solution {
    public int countDigits(int num) {
        int count = 0;
        int length = String.valueOf(num).length();
        int dup = num;
        int div = 0;
        for(int i = 0; i <length;i++){
            div = num%10;
            if(dup%div == 0){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}
