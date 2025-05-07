import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Nibedan");
        stack.push("Alan");
        stack.push("Mark");
        stack.push("Bill");

        String poped_name = stack.pop();
        System.out.println(poped_name);

        System.out.println(stack.peek());

        System.out.println(stack.search("Mark"));


        System.out.println(stack);
    }
}