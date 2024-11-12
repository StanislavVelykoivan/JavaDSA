public class Queue {

    private int front;
    private int rear;
    private int size;
    private int[] arr;

    public Queue() {
        front = 0;
        rear = -1;
        size = 0;
        arr = new int[4];
    }

    public int dequeue() {
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        int temp = arr[front];
        front = (front + 1) % 4;
        size--;
        return temp;
    }

    public void enqueue(int data) {
        if (!isFull()){
            rear = (rear + 1) % 4;
            arr[rear] = data;
            size++;
        }else {
            System.out.println("Queue is full");
        }
    }

    public int peek(){
        if (isEmpty())
            throw new RuntimeException("Queue is empty");

        return arr[front];
    }


    public boolean isFull(){
        return size == 4;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
