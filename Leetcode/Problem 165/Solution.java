class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
         for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Check for palindrome

        int left = 0;
        int right = cleaned.length()-1;
        while(left<right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}