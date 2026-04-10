class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String str = s.trim();
        String words[] = str.split(" +"); // regex apply so that one or more spaces

        for(int i = words.length-1 ; i >=0 ;i--){
            sb.append(words[i]);
            if(i !=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
