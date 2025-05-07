package recursion;

public class recursion4 {
    // what to do ?? 
    // Sum of N numbers 
    // if N = 3 then 1+2+3 using recursion 

    public static void parameterised_sum(int i ,int sum){
        if (i<1) {
            System.out.println(sum);
            return;
        }
        parameterised_sum(i-1, sum+i);
        
    }

    public static int functional_sum(int n){
        if(n==0){
            return 0;
        }
        return n + functional_sum(n-1);

    }

    public static void main(String[] args) {
        int n = 4;
        // parameterised_sum(n, 0);
        System.out.println(functional_sum(n));
    }
}
