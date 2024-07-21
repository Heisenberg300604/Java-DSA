import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declaring an Array

        //syntax
        // datatype[] variable_name = new datatype[size];
        // for example -
        int[] rnos = new int[5];
        // or direct way to write can be :
        int[] rollnos = {30,21,22,99,97};

        // Array of Primitives...

        int[] arr = new int[5];
        arr[0] =3; // assigning values to the array elements !
        arr[1] =32;
        arr[2] =53;
        arr[3] =69;
        arr[4] =100;
//        System.out.println(arr[2]); // accessing the element of the array

        // input using for loops
        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

        // Printing the inputted array !

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        for (int j : arr) {// for every element in array , print the element
//            System.out.print(j + " "); // here j represents element of the array
//        }
//        System.out.println(arr[5]); // gives you error : index oyt of bound error

//        another way to print arrays can be :

//        System.out.println(Arrays.toString(arr)); // toString method also internally uses for loops


        // array of objects
        
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
        }

        System.out.println(Arrays.toString(str));

    }
}