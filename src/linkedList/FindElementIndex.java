package linkedList;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        next=null;
    }
}
public class FindElementIndex {
    public  int findNode(Node1 head, int data){

        if(head==null){
            return -1;
        }
             int count=0;

        while(head != null){

            if(head.data==data){

                return count;
            }
            count++;

            head=head.next;
        }
return -1;

    }
}
