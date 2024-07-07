public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;

        // swap two numbers....
//        int temp = a;
//        a=b;
//        b = temp;
//        Here it actually changes the values of a and b....
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
//    lets try it with a function....
    static void swap (int a ,int b){ // does not swaps a and b in actual..
        int temp =a;
        a =b;
        b =temp;
    }
}


// Note --> In Java we dont have pass by Reference.. we only have pass by value

