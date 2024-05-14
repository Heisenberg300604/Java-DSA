class Solution {
    public boolean isPalindrome(int x) {
        int Number = x;
        int ReversedNumber = 0;
        if(x<0){
            return false;
        }
        while(Number != 0){
            int n = Number%10;
            ReversedNumber = ReversedNumber*10+n;
            Number = Number/10;
        }
        if(ReversedNumber == x){
            return true;
        }else{
            return false;
        }
    }
}
