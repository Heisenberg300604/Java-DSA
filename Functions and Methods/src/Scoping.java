public class Scoping {
    public static void main(String[] args) {
        int a =9;
        int b = 3;
        // anything initialised outside can be accessed inside the block but anything that is initialised inside the block can be again initialised outside the block
        {
            a = 8; // value can be changed for a as it is in the same function
            int c = 88;
            // values iniitialised in the block will remain in the block
        }
        // lets say we want to access the value of c here...
//        System.out.println(c); it will give me an error as it can't be accessed outside the scope
    }

    static void function1(int number){
        int num = 70;
        System.out.println(num);
        System.out.println(number);
    }
}
