import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        // if we enter integer value it converts it into float value
//        float num = input.nextFloat();
//        System.out.println(num);

//        Actual typecasting:
//        int num = (int)(69.698f);
        // removes the decimal values
//        System.out.println(num);
        // automatic type promotion in expressions
//        int a =257;
//        byte b = (byte)(a); // 257%256 = 1
//        System.out.println(b);
//        A byte can store till a value of 256 only...

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
        // for this particular operation java converts the a*b expression to integer so as to perform the operation

//        int d = (a*b)/c;

//        System.out.println(d);
//        int number = 'A'; // automatic type conversion to 65
//        System.out.println(number);
          byte b =42;
          char c = 'a';
          short s = 1024;
          int i = 50000;
          float f  = 5.67f;
          double d = 0.1234;
          double result = (f*b) + (i / c)- (d*s);
        System.out.println((f*b) +" "+ (i / c) + " "+ (d*s));
        System.out.println(result);
        // java follows unicode

    }
}
