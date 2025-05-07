package recursion;

// write program for checking palindrome 

// write program for reversing an array 

// Both to be done using recursion

public class recursion5 {

    static boolean palindrome(String str, int start, int end){
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return palindrome(str, start+1, end-1);
    }

    static void reverse_arr(int [] arr, int start,int end){
        if (start >= end) {
            return; 
        }
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]= temp;


        reverse_arr(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int start =0;
        int end = arr.length -1;
        reverse_arr(arr,start,end);
        for (int i : arr) {
            System.out.print(i+ " ");
        }


        String str = "nibedan";
        
        boolean result = palindrome(str,0,str.length()-1);
        // System.out.println(result);
        if (result== true) {
            System.out.println(" The given String that you enteered is a Palindrome");
        }else{
            System.out.println("Not a Palindrome ! ");
        }
    }
}
