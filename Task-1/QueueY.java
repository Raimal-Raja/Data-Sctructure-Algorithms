public class QueueY {
    static class Queue {

        static int arry[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arry = new int[n];
            this.size = n;

        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //enqueue
        public static void add(int data){
            if (rear ==size-1){
                System.out.println("full queue");
                return;
            }
            
            rear ++;
            arry[rear] =data;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
             return -1;   
            }
            int front = arry[0];
            for(int i = 0; i<rear; i++){
                arry[i] = arry[i+1];
            }
            rear --;
           return front;
        }
       
    }
    public static void main(String[] args) {
        Queue q =  new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
