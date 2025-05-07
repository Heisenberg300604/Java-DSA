package recursion;
import java.util.Scanner;

class Recursion{
    // print name N times using Recursion

    public static void recursion_one(int i , int n){
        if (i>n) {
            return;
        }
        System.out.println("Heisenberg ! ");
        recursion_one(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print your name: ");
        int n = sc.nextInt();
        recursion_one(1, n);
    }
}