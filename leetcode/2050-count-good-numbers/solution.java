class Solution {
    static final int MOD = 1000000007;
    private long power(long x,long n , int MOD){
        if (n == 0) return 1; // base case for the recursion
        long half = power((x * x) % MOD, n / 2, MOD);
        if (n % 2 == 0) return half % MOD;
        else return (x * half) % MOD;
    }
    public int countGoodNumbers(long n) {
        // we use long to prevent the overflow
        long even_positions = (n + 1) / 2;
        long odd_positions = n / 2;
        long result = (power(5, even_positions, MOD) * power(4, odd_positions, MOD)) % MOD; // use MOD outside the methods
        return (int) result;
    }
}
