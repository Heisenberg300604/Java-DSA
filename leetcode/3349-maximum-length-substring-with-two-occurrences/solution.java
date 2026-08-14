class Solution {
    public int maximumLengthSubstring(String s) {
        // use 2 ptrs , we can use sliding window 
        int max_length = 0;
        int left = 0;
        int[] map = new int[26];
        for(int right = 0; right < s.length() ; right++ ){
            int ch = s.charAt(right) -'a';
            map[ch]++;
            while(map[ch] > 2){ // jab tk value 2 se neeche ya equal na ho jaye tb tk
                int removed_char = s.charAt(left) - 'a';
                left++;
                map[removed_char]--;
            }
            max_length = Math.max(max_length , right - left+1);
        }
        return max_length;
    }
}
