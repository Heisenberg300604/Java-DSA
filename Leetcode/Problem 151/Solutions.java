class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();
        for(int i = words.length-1;i>0;i--){
            out.append(words[i]).append(" ") ;
        }
        return out.toString() + words[0];
    }
}