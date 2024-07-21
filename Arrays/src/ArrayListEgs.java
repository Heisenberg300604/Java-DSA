import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEgs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

//        we can also write the syntax in this form -
//        ArrayList list = new ArrayList(); {but its not a good practice}..

//        how to add elements in the arraylist ?
//        by using a method called .add();
//        list.add(32);
//        list.add(69);
//        list.add(92);
//        list.add(99);
//        list.add(72);
//        list.add(372);
//        list.add(36);
//        list.add(335);
//        list.add(532);
//        list.add(123);
//        list.add(5312);

//        System.out.println(list);
//        System.out.println(list.contains(72)); // .contains() checks if the element is there in the ArrayList
//        list.set(1,100);
//        list.remove(2);
//        System.out.println(list);

        // Taking input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Producing output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here
        }

    }
}
