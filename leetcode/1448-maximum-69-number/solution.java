class Solution {
    public int maximum69Number (int num) {
        int max= num;
        char[] digits = String.valueOf(num).toCharArray();
        for(int i =0; i<digits.length;i++){
            char original = digits[i];
            if(digits[i] == '6'){
                digits[i] = '9';
            }
            int modifiedNum = Integer.parseInt(new String(digits));
            if(modifiedNum> max){
                max = modifiedNum;
            }
            digits[i] = original;
        }
        return max;
    }
}
