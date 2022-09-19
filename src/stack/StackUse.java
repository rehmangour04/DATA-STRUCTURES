package stack;

public class StackUse {

    public static void main(String[] args) throws StackFullException {

        StackUsingLL<Integer>  stack=new StackUsingLL<>();

//        StackUseArray stack=new StackUseArray(3);
        for(int i=1;i<=5;i++){

            stack.push(i);
        }

while(!stack.isEmpty()){
    try{
        System.out.println(stack.pop());
    } catch (StackEmptyException e) {
//        e.printStackTrace();
    }
}
    }
}
