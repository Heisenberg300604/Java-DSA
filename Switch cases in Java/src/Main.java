import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a Programming Language about which you want to know : ");
        Scanner input = new Scanner(System.in);
        String language = input.next();

        // Enhanced Switch statements !
        switch (language) {
            case "Javascript" -> System.out.println("Javascript is used for web development");
            case "C++" -> System.out.println("C++ is used mainly for competitive programming and learning DSA");
            case "Java" -> System.out.println("Java is used for Software development and also to learn DSA");
            case "C#" -> System.out.println("C# is used for game development");
            case "Python" -> System.out.println("Python is used for AIML and GenAI stuff !");
            default -> System.out.println("Chosen language not in the database ! Unable to  retrieve information...! ");
//            switch (language){
//                case "Javascript":
//                    System.out.println("Javascript is used for web development");
//                    break;
//                case "C++":
//                    System.out.println("C++ is used mainly for competitive programming and learning DSA");
//                    break;
//                case "Java":
//                    System.out.println("Java is used for Software development and also to learn DSA");
//                    break;
//                case "C#":
//                    System.out.println("C# is used for game development");
//                    break;
//                case "Python":
//                    System.out.println("Python is used for AIML and GenAI stuff !");
//                    break;
//                default:
//                    System.out.println("Chosen language not in the database ! Unable to  retrieve information...! ");
        }
    }
}