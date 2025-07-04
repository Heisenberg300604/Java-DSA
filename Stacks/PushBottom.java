package Stacks;

import java.util.Stack;

// question - we are given a stack and we need to push the given element to the botom of the stack 
// for example - stack - [1,2,3] then we need to add 4 at the bottom that is 4 at the start
// so that will become [4,1,2,3]

public class PushBottom {

    public static void PushAtBottom(int data,Stack<Integer> s){
        // will solve using recursion

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(data, s);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        PushAtBottom(4,s);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
