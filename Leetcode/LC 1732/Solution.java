// 1732. Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] altitude = new int[n+1];
        int max = 0;
        altitude[0] = 0;
        for(int i =1; i<=n;i++){
            altitude[i] = altitude[i-1] + gain[i-1];
            if(altitude[i]>max){
                max = altitude[i];
            }
        }
        return max;
    }
}
