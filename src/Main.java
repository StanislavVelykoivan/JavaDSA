
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(8);
        queue.enqueue(45);

        queue.enqueue(23);
        queue.enqueue(73);

        System.out.println(queue.dequeue() + " - deleted");



        queue.enqueue(63);

        System.out.println(queue.peek() + " - peek");

    }
}