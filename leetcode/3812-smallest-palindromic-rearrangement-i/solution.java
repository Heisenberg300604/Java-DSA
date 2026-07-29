class Solution {
    public String smallestPalindrome(String s) {
        //daccad - n is 6 so n/2 will be 3
        // babab - n is 5 so n/2 will be 2.5 i.e 2
        int n = s.length();
        String str = s.substring(0, n / 2);
        // now sort the left half
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String left = new String(arr);
        String right = new StringBuilder(left).reverse().toString();

        if(n %2 == 0 ){
            return left+right;
        }else{
          return  left+ s.charAt(n/2)+ right;
        }
        
    }
}
