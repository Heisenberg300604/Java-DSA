class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>(); // make a new hashset to store the elements
        int max_length = 0 ;
        int i = 0 ;
        for(int j = 0 ; j < s.length();j++){
            while(window.contains(s.charAt(j))){
                window.remove(s.charAt(i));
                i++; // shrink the window
            }
            window.add(s.charAt(j));
            max_length = Math.max(max_length , j-i+1);
        }
        return max_length;
    }
}
