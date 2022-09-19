package Queue;

public class QueueUsingArray {
    private int data[];
    private int front; // index at which front element is stored
    private int rear; // index at which rear element is stored
    private int size;

//    public QueueUsingArray() {
//        data = new int[3];
//        front = -1;
//        rear = -1;
//        size = 0;
//    }

    public QueueUsingArray( int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int front() {
        if (size == 0) {
        }
        return data[front];
    }

    void enqueue(int element) {
        if (size == 0) {
            front = 0;
        }
        size++;
        rear = (rear + 1) % data.length;
        data[rear] = element;
    }

   // if we want to convert this code into dynamic then use this function doubleCapacity()
    private void doubleCapacity() {
        int[] temp = data;
        data = new int[ 2* temp.length];
        int index = 0;
        for(int i = front ; i < temp.length; i++){
            data[index] = temp[i];
            index++;
        }
        for(int i = 0; i <= front - 1;i++){
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length - 1;
    }



    int dequeue() {

        int temp = data[front];
        front = (front + 1) % data.length;

        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }


    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(10);
        for (int i = 1; i <= 40; i++) {
            queue.enqueue(i);
            while (!queue.isEmpty()) {
                System.out.print(queue.dequeue() + " ");

            }


        }
    }

}