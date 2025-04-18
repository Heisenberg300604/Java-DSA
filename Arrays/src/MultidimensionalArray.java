import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
     /*
        1 2 3
        4 5 6
        7 8 9
     */

     int[][] arr = new int[3][3];

     Scanner in = new Scanner(System.in);

//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {28,13,89}
//        };

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//        for (int row = 0; row < arr.length ; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }

//        can also be printed as -
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
