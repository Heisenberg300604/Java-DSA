import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//            sum(); // calling the method
//            Greeting();
//            int ans = Method2sum();
//            System.out.println(ans);
//              String s =greet();
//              System.out.println(s);
                String message = myGreet("Nibedan Pati");
        System.out.println(message);
//        int answer = Method3sum(30,20);
//        System.out.println(answer);
        }
        // create a function that takes two numbers adds them and prints the sum as output
        // defining the sum method
        static void sum(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int num1 = input.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = input.nextInt();
            int sum = num1+num2;
            System.out.println("The sum is = "+ sum);
        }

        static void Greeting(){
        // Here the return type is void as it is not returning any kind of boolean value or integer
            System.out.println("Hello World ! ");
        }

        // now let's say we want to return something...

        static int Method2sum(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int num1 = input.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = input.nextInt();
            int sum = num1+num2;
            return sum;
        }

        // lets look at another return type...

        static String greet(){
            String greeting = "how are you ?";
            return greeting;
        }

        // pass the value  of numbers when you are callingthe method in int main()
        static int Method3sum(int a,int b){
            int sum = a+b;
            return sum;
        }

        // string return type and parameter...
        static String myGreet(String name){
            String greetings = "welcome "+ name;
            return greetings;
        }
    }
