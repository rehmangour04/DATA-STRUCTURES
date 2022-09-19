package Queue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class QueueUsingLL {

    private Node front;
    private Node rear;
    private int size;


    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;

    }

    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public void enqueue(int data) {
        Node cn = new Node(data);
        if (front == null) {
            front = cn;
            rear = cn;
        } else {
            rear.next = cn;
            rear = rear.next;
        }
        size++;
    }


    public int dequeue() {
        if (front == null) {
            return -1;
        }
        int temp = front.data;
        front = front.next;
        size--;
        return temp;
    }


    public int front() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }

        System.out.println("queue using linkedlist");

        while (!queue.isEmpty()) {

            System.out.print(queue.dequeue()+ " ");

        }


    }
}