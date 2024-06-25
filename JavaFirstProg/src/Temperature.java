import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
//        write a program to convert degree C to degree fahrenheit

        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the temperature in C: ");
        float temp_C = input.nextFloat();
        float temp_F = (temp_C * 9/5)+ 32; // the formula

        System.out.println(temp_F);

    }
}
