import java.sql.SQLOutput;
import java.util.Scanner;

public class Pyramid {

    public static void PyramidPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n-i-1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows you want in your pyramid ");
        int rows = sc.nextInt();
        PyramidPattern(rows);
    }
}
