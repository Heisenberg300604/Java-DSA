class Solution {
    public boolean isIsomorphic(String s, String t) {
        // another way ( efficient to solve this problem )
        // take two arrays of map
        // why 256 size ? because ascii characters range from 0 to 255 
        int [] map1=new int[256];
        int[] map2= new int[256];
        // iterate over the array 
        for (int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            // if empty position 
            if(map1[c1]==0 && map2[c2]==0){
                map1[c1]=c2;
                map2[c2]=c1;
            }
            else {
                if (map1[c1]!=c2 || map2[c2]!=c1){
                return false;
            }
            }
        }
        return true;
    }
}
