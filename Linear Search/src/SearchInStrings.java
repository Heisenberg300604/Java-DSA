import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Nibedan";
        char target = 'b';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray())); // converts string to character array
    }
    static boolean search(String str,char target){
        if (str.length() == 0) { //Here .length() is the method not the variable
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
