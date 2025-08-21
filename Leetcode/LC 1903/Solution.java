class Solution {
    public String largestOddNumber(String num) {
        for( int i = num.length()-1; i >=0 ; i-- ){
            if((num.charAt(i)-'0') %2 != 0){ // here we converted the string value into number look at the ASCII codes 0 = 49 etc...
                return num.substring(0,i+1);
                // we basically returned the substring that is the largest odd number 
            }
        }
        return "";
    }
}