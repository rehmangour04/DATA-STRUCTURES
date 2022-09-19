package linkedList;
public class LinkedListLength {


    LinkedListNode head;
    public void push(int newData){
        LinkedListNode newNode=new LinkedListNode(newData);
        newNode.next=head;
        head=newNode;
    }
    public int getCount(){
        LinkedListNode temp=head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        LinkedListLength list= new LinkedListLength();
         list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        System.out.println("length of LL is" + " " + list.getCount());
    }
}
