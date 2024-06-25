import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Creating a program for adding sum of two numbers
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number_1 = number1.nextInt();
        System.out.println("Enter the second number : ");
        int number_2 = number2.nextInt();
        int sum = number_1 + number_2;
        System.out.println("The sum of the two numbers are : "+sum);
    }
}
