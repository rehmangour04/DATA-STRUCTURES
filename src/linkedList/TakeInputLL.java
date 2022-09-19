package linkedList;

import java.util.Scanner;

public class TakeInputLL {

    public static Node<Integer> inputData(){

        Node<Integer> head=null, tail=null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        while(data != -1){
      Node<Integer>  newNode=new Node<>(data);
      if(head==null){
          head=newNode;
          tail=newNode;
      }
      else{
          tail.next=newNode;
          tail=tail.next;
      }
      data=sc.nextInt();
        }
        return head;

    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.println();
        }
    }

    public static void main(String[] args) {


    }
}
