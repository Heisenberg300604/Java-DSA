package Stacks;

import java.util.Stack;

public class Collections {
    public static void main( String args[]){
        // Stacks can also be implemented using Java collection framework
        Stack<Integer> s = new Stack<>();
        // already has push(), pop() and isEmpty() functions
        s.push(2);
        s.push(3);
        s.push(5);
        s.push(21);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
