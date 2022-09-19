package stack;

public class StackUseArray {

    private int[] data;
    private int top; //topmost element index

    public StackUseArray(){
        data=new int[10];
        top=-1;

    }

    public StackUseArray(int capacity){
        data=new int[capacity];

    }

    public boolean isEmpty(){
            return  (top==-1);
        }

        public int size(){
        return top+1;
    }

    public int top() throws StackEmptyException{
        if(size()==0){
            //stackemptyexception
            StackEmptyException e = new StackEmptyException();
            throw e;

        }

        return data[top];

    }

    public void push(int element) throws StackFullException{
        if(size()== data.length){
            doubleCapacity();
        }
        top++;
        data[top]=element;
    }
    private void doubleCapacity(){

        int[] temp =data;
        data=new int[2*temp.length];
        for(int i=0;i<=top;i++){
            data[i]=temp[i];
        }
    }
    public int pop() throws StackEmptyException {
        if(size()==0){
            //stackemptyexception

            StackEmptyException e = new StackEmptyException();
            throw e;

        }
        int temp=data[top];
        top--;
        return temp;
    }


}
