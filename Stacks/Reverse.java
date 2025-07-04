package Stacks;

import java.util.Stack;

public class Reverse {

    // that means [1,2,3] becomes [3,2,1]
    public static void ReverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();

        ReverseStack(s);
        insertAtBottom(s,top);
    }
    public static void insertAtBottom(Stack<Integer> s, int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, x);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        ReverseStack(s);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
