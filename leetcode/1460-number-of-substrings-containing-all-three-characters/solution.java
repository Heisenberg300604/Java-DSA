class Solution {
    public int numberOfSubstrings(String s) {
        int count =0 ; 
        int left = 0 ;
        int right = 0 ;
        int hash[] = new int[3]; // store a , b and c

        while(right < s.length()){
            hash[s.charAt(right)-'a']++;
            while(hash[0] > 0 && hash[1] > 0 && hash[2] > 0){
                count += s.length() - right;
                hash[s.charAt(left) -'a']--;

                left++;
            }
            right++;
        }

        return count;
    }
}
