public class Stack {

    private int arry[];
    private int top;

    public Stack(int capacity) {
        arry = new int[capacity];
        top = -1; 
    }

    // Push operation
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow!");
            return;
        }
        arry[++top] = element; 
        System.out.println("Pushed element: " + element);
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1; 
        }
        return arry[top--]; 
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; 
        }
        return arry[top]; 
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == arry.length - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(12);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Peek element
        System.out.println("Top element: " + stack.peek());
    }
}
