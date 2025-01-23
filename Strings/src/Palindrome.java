
public class Palindrome {
    public static void main(String[] args) {
        String check = "abcba";
        System.out.println(isPalindrome(check));
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
