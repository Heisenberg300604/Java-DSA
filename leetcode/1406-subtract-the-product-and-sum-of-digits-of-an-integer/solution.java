class Solution {
    public int subtractProductAndSum(int n) {
        int Product=1;
        int Sum=0;
        while(n>0){
            int rem = n%10;
            Product = Product*rem;
            Sum = Sum+rem;
            n=n/10;
        }
        int Result = Product - Sum;
        return Result;
    }
}
