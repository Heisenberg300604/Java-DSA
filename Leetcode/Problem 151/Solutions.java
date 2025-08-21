class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        // for trailing white spaces we take \\s+ 
        StringBuilder out = new StringBuilder();
        // For building strings in a loop or dynamically, always use StringBuilder
        for(int i = words.length-1;i>0;i--){
            out.append(words[i]).append(" ") ;
        }
        return out.toString() + words[0];
    }
}