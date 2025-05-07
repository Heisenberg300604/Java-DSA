package recursion;

public class multiplerecc {


// solving fibonacci problem using recursion ! 

    // But this is a really bad approach as it has a really big time complexity of 2^n
    // Multiple function calls are made which is not good 
    static int fibonacci(int n ){
        if(n<=1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);
        return last+slast;
    }
    // first let me solve fibonacci number problem using normal methopd that is the for loop 
    public static void main(String[] args) {
        // int n = 5;
        // int a = 0, b = 1;
        // System.out.print("Fibonacci Series: ");
        // for (int i = 0; i < n;  i++) {
        //     System.out.print(a + " ");
        //     int next = a + b;  // calculate next number
        //     a = b;             // move b to a
        //     b = next; 
        // }
        // OUTPUT - Fibonacci Series: 0 1 1 2 3 
        System.out.println(fibonacci(4));

    }
}
