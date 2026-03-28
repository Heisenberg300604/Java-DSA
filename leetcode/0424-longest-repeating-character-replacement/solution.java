class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0 ; 
        int right = 0 ;
        int[] freq = new int[26];
        int maxLen = 0 ;
        int maxFreq = 0;
        while(right < s.length()){
            Character rightChar = s.charAt(right);
            freq[rightChar -'A']++;
            maxFreq = Math.max(maxFreq, freq[rightChar - 'A']);
            if((right -left + 1) - maxFreq > k ){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
