public class Queue {
    int MAX_SIZE;
     int[] queue;
     int front, rear;

    public Queue(int maxSize) {
        this.MAX_SIZE = maxSize;
        queue = new int[maxSize];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return rear == MAX_SIZE - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow Error");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }

        queue[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow Error");
            return -1; 
        }

        int data = queue[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }

        return data;
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

       
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

       
        System.out.println("Queue elements: ");
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.dequeue() + " ");
        }
        System.out.println(); 

       
        System.out.println("Dequeued elements: ");
        System.out.println(myQueue.dequeue()); 
        myQueue.enqueue(40);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
