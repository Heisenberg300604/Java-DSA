
import java.util.Arrays;

public class Varargs {
//    What are Varargs ?? When we don't know how many inputs we are giving.
    public static void main(String[] args) {
//        varargs(1,2,3,4,5,8,6,4,76,8); // takes multiple arguments

//        multiple(23,43,"Nibedan","heisenberg");

        demo(1,2,3,45,623,65,66,669,7,4,8);


    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(v);
    }
    static void varargs(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
