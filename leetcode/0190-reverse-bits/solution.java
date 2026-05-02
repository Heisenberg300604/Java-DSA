class Solution {
    public int reverseBits(int n) {
        if(n==0) return 0;
        int result = 0 ;
        for(int i = 0 ; i < 32 ;i++){
            int bit = n&1; // extract the last bit
            n >>>= 1; // unsigned right shift
            result <<=1; // make space for the bit
            result |= bit; // insert the bit
        }
        return result;
    }
}
