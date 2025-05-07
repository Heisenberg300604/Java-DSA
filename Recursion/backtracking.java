package recursion;

import java.util.Scanner;

public class backtracking {
    // i need to print 1 to N without using ( i +1 , n ) thing as we used first in the recursion1 problem
    
    public static void backtrack1(int i, int n){
        if (i<1) {
            return ;
        }
        backtrack1(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        backtrack1(n,n);
    }
}
