class Solution {
    public int rotatedDigits(int n) {
        int goodNumbers = 0 ;
        for(int i = 1 ; i <= n ;i++){
            int temp = i;
            boolean hasGoodDigit = false;
            boolean isValid = true;
            while(temp > 0){
                int x = temp%10;
                if (x == 3 || x == 4 || x == 7) {
                    isValid = false;
                    break;
                }
                if(x == 2 || x == 5 || x == 6 || x == 9){
                    hasGoodDigit = true;
                }
                temp = temp/10;
            }
            if (isValid && hasGoodDigit) {
                goodNumbers++;
            }
        }
        return goodNumbers;
    }
}
