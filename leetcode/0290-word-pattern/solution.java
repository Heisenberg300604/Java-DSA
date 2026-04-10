class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        if (words.length != pattern.length()) return false;
        for(int i = 0 ; i < pattern.length();i++){
            char c = pattern.charAt(i);
            String w = words[i];
            boolean containsKey = map.containsKey(c);

            if(map.containsValue(w) && !containsKey){
                return false;
            }
            if(containsKey && !map.get(c).equals(w)){
                return false;
            }
            else{
                map.put(c, w);
            }  
        }

        return true;
    }
}
