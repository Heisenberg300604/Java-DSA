class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        String str = s.trim(); // remove the extra spaces
        
        for(int i = str.length()-1 ; i >= 0 ;i--){
            if(str.charAt(i) == ' '){
                break;
            }
            length++;
        }

        return length;
    }
}
