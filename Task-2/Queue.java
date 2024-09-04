public class Queue {

    int MAXSIZE = 100; 
    int[] queue = new int[MAXSIZE]; 
    int front = -1, rear = -1; 

    // isEmpty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // isFull
    public boolean isFull() {
        return rear == MAXSIZE - 1;
    }

    //Enqueue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow Error");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear++;
            }
            queue[rear] = data;
        }
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow Error");
            return -1; 
        } else {
            int data = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
            return data;
        }
    }

    // Peek: Returns the element at the front of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow Error");
            return -1;
        } else {
            return queue[front];
        }
    }

    // maximum capacity of the queue
    public int capacity() {
        return MAXSIZE;
    }

    // Returns the current number of elements in the queue
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            if (front <= rear) {
                return rear - front + 1;
            } else {
                return MAXSIZE - front + rear + 1;
            }
        }
    }

    // Clears the queue
    public void clear() {
        front = rear = -1;
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        // Enqueue some elements
        myQueue.enqueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(15);

        // Peek at the front element
        System.out.println("Front element: " + myQueue.peek()); 

        // Dequeue and print elements
        while (!myQueue.isEmpty()) {
            int element = myQueue.dequeue();
            System.out.println("Dequeued element: " + element);
        }

         // Enqueue more elements to test capacity and size
         for (int i = 40; i <= 104; i++) {
            myQueue.enqueue(i);
        }

        System.out.println("Queue capacity: " + myQueue.capacity()); 
        System.out.println("Queue size: " + myQueue.size()); 

        // Clear the queue
        myQueue.clear();
        System.out.println("Queue size after clearing: " + myQueue.size()); 
    }
}
