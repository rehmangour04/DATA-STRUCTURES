package stack;

import java.util.Stack;

public class StackAddingElementes {


    public static void main(String[] args) {

        Stack<Integer> stack1=new Stack<>();

        Stack<String> stack2=new Stack<>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        stack2.push("rehman");
        stack2.push("gour");
        stack2.push("Peace happy");

        System.out.println(stack1);
        System.out.println(stack2);
    }
}
