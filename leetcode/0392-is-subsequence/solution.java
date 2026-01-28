class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0 ; 
        int j = 0 ;
        int n = s.length();
        int m = t.length();
        // now check that if s is subseq of t
        while(n > i && m > j ){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                
            }
            j++;
        }
        return i == n;
    }
}
