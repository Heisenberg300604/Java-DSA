class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder common = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(i >=strs[j].length() ||strs[j].charAt(i) != c){
                    return common.toString();
                }
            }
            common.append(c);
        }
        return common.toString();
    }
}
