package stack;
import java.io.*;
import java.util.*;


public class StackDemo {

    // Main Method
    public static void main(String[] args)
    {

        // Default initialization of Stack
        Stack<Serializable> stack1 = new Stack<Serializable>();

        // Initialization of Stack
        // using Generics
        Stack<Integer> stack2 = new Stack<Integer>();

        // pushing the elements
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.size();
stack1.pop();
stack1.push(8);
       stack1.peek();


        // Printing the Stack Elements
        System.out.println(stack1);
    }

}
