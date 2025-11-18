class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> map = new HashMap<>();
        // store the letters of magazine in a hashmap 
        for(char c : magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // check if the letters in ransomeNote and magazine match each other or not
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
