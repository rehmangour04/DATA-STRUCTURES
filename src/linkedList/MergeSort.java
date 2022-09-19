package linkedList;


  class ListNode1{

     int  val ;
     ListNode1 next;

     ListNode1(int data){
         next=null;
     }
 }

public class MergeSort {

    public static ListNode1 mergeSort(ListNode1 head) {
        if(head==null)
        {
            return null;
        }
        else if(head.next==null) {
            return head;
        }

        ListNode1 middle= midpoint(head);
        ListNode1 head1=head,head2=middle.next;
        middle.next=null;

        head1=mergeSort(head1);
        head2=mergeSort(head2);
        head=mergeTwoLists(head1, head2);

        return head;
    }
    public static ListNode1 midpoint(ListNode1 head)
    {
        ListNode1 slow = head;
        ListNode1 fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val < list2.val){
            list1.next=mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }


    }





}
