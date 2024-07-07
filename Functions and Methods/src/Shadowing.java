public class Shadowing {
    static int x = 100; // will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); // will print 100
        int x = 90;
        System.out.println(x); // 90 will be printed
//        Why ?? because the higher level scope will be hidden which is known as shadowing....
        trial_function();
    }

    static void trial_function(){
        System.out.println(x);
    }
}
