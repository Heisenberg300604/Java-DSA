class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int temp = 0;
        while(n > 0){
            int digit = n%10;
            n = n/10;
            if(digit == 0){ // not include 0
                continue;
            }
            temp = temp*10 + digit;
        }

        while(temp > 0){
            int digit = temp%10;
            temp = temp/10;
            x = x*10 + digit;
        }
        int sum = 0;
        temp = x;

        while(temp >0){
            sum+= temp%10;
            temp = temp/10;
        }

        return (long)x*sum;
    }
}
