class Solution {
    public String toLowerCase(String s) {
        StringBuilder lc = new StringBuilder();
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90 ){
                char c = (char) (s.charAt(i) +32) ; 
                lc.append(c);
            }else{
                lc.append(s.charAt(i));
            }
        }
        String result = lc.toString();
        return result;
    }
}
