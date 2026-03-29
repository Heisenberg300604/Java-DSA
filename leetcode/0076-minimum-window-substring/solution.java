import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;

        HashMap<Character,Integer> hash = new HashMap<>();

        for(char c : t.toCharArray()){
            hash.put(c , hash.getOrDefault(c,0)+1);
        }

        int count = 0;
        int l = 0;
        int r = 0;

        while(r < s.length()){

            char rc = s.charAt(r);

            if(hash.getOrDefault(rc,0) > 0){
                count++;
            }

            hash.put(rc , hash.getOrDefault(rc,0)-1);

            while(count == t.length()){

                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    sIndex = l;
                }

                char lc = s.charAt(l);

                hash.put(lc , hash.getOrDefault(lc,0)+1);

                if(hash.get(lc) > 0){
                    count--;
                }

                l++;
            }

            r++;
        }

        return sIndex == -1 ? "" : s.substring(sIndex , sIndex+minLen);
    }
}
