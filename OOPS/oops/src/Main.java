
public class Main {
    public static void main(String[] args) {
       // store 5 roll numbers
//        int[] numbers = {1,2,3,4,5};
//        int[] nums = new int[5];

        // store 5 names
//        String [] names = new String[5];

        // data of 5 students
//        int[] rno = new int[6];
//        String[] name = new String[6];
//        int[] marks = new int[7];

        // we can use class instead to make our own data type Students = {marks, rollno , name}

        // create a class
        Student nibedan = new Student(); // here Student() it is the by default constructor
        // the new keyword allocates dynamic memory here that is during the runtime
        // new = keyword
        // Student(); = constructor
        // it is a special type of function in class by which you create objects and it allocates some reference variables
        // nibedan = the object that is created here
        // Student = name of the class

        // this will print the by default value of them
//        System.out.println(nibedan.rollno);
//        System.out.println(nibedan.name);
//        System.out.println(nibedan.marks);

        nibedan.rollno = 72;
        nibedan.name = "Nibedan Pati";
        nibedan.marks = 54.5f;

        nibedan.greeting();


//        System.out.println(nibedan.rollno);
//        System.out.println(nibedan.name);
//        System.out.println(nibedan.marks);
    }
}

class Student {
    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hi...My name is " +name);
    }

    // to access every object we need a word i.e this keyword in order to access the object in the class template

    // constructor
    Student(){
        this.rollno = 72;
        this.name = "Nibedan";
        this.marks = 99.9f;
    }
}