package linkedList;


public class SwapLL {

    // Utility function to print the LinkedList
    public static void print(NodeNew head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    // Function definition for swapping the nodes
    public static NodeNew swapPairs(NodeNew head) {
        // Check whether the list is empty or has one node
        // If yes, then return head
        if (head == null || head.next == null) {
            return head;
        }
        // If the list has more than 1 node, then initialize a new node
        // which will always point to the second node of a pair
        NodeNew new_head = head.next;
        // initialize a new node for pointing to the adjacent node of a pair
        NodeNew third = head.next.next;
        // Update the link
        // for example 1->2->3->null
        // Result = 2->1   3->null
        new_head.next = head;
        // Update the head link
        // Result = 2->1->{retrieved value} via recursive call
        head.next = swapPairs(third);
        // Finally, return the new list
        return new_head;

    }

    public static void main(String args[])
    {

        NodeNew head = new NodeNew(1);
        // 1->2
        head.next = new NodeNew(2);
        // 1->2->3
        head.next.next = new NodeNew(3);
        // 1->2->3->4
        head.next.next.next = new NodeNew(4);
        System.out.println("Original Linked List: ");
        print(head);
        System.out.println("\nUpdated List after swapping: ");
        print(swapPairs(head));
    }
}