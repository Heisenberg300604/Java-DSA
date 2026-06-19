class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0 ;
        int maxGain = 0 ;
        // optimised
        for(int g : gain ){
            altitude += g;
            maxGain = Math.max(altitude ,maxGain);
        }
        return maxGain;
    }
}
