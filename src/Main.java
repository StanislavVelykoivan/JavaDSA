

public class Main {
    public static void main(String[] args) {
        Stack nums = new Stack();

        nums.push(10);
        nums.push(30);
        System.out.println(nums.pop());
        nums.push(160);
        nums.push(78);
        nums.push(23);
        nums.push(23);



        nums.printStack();
    }
}