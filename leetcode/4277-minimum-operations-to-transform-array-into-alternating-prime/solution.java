class Solution {
    public boolean isPrime(int n){
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    public int makePrime(int n){
    int ops = 0;
    while(!isPrime(n)){
        n++;
        ops++;
    }
    return ops;
}
    public int makeNonPrime(int n){
    int ops = 0;
    while(isPrime(n)){
        n++;
        ops++;
    }
    return ops;
}
    public int minOperations(int[] nums) {
        int minops = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                // even index - prime
                if (!isPrime(nums[i])) {
                    minops += makePrime(nums[i]);
                }
            } else {
                // odd index - non-prime
                if (isPrime(nums[i])) {
                    minops += makeNonPrime(nums[i]);
                }
            }
        }
        return minops;
    }
}
