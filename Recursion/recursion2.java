package recursion;

public class recursion2 {
    // print 1 to N numbers by using the concept of recusion 
    // let us say N is 5 then 1,2,3,4,5

    public static void number_printing(int i , int n){
        if(i>n){
            return ;
        }
        System.out.println(i);
        number_printing(i+1,n);
    }

    // now print in reverse order - 5,4,3,2,1
    public static void reverse_printing(int i, int n ){
        if(n<i){
            return;
        }
        System.out.println(n);
        reverse_printing(i,n-1);
    }


    public static void main(String args[]){
        // System.out.println("Testing");
        // number_printing(1,100);

        reverse_printing(1,10);
        
    }
}
