
import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tell the number till which you want to check Armstrong Numbers..");
        int n = in.nextInt();
//        System.out.println(isArmstrong(n));
        printArmstrongNo(n);
    }

    // Function to print all 3 digit armstrong numbers

    static void printArmstrongNo(int n){
        for (int i = 100; i < n; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Check whether a number is Armstrong number or not...
    // Armstrong number is when sum of individual digits = original number
    static boolean isArmstrong(int k){
        int originalnumber = k;
        int sum = 0;
        while(k>0){
            int rem = k%10;
            k = k/10;
            sum = sum+ rem*rem*rem;
        }
        return originalnumber==sum;
    }



    // Funcction to determin whether the number is Prime or not !
    static boolean isPrime(int n){
        if (n <=1){
            return false;
        }
        int c =2;
        while(c*c <=n){
            if (n%c == 0){
                return false;
            }
            c++;
        }

        return c*c > n;
    }
}
