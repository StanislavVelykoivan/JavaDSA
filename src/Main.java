public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(28);
        list.insert(38);
        list.insert(48);
        list.insertAtStart(58);
        list.insertAt(0,39);

        list.deleteAt(3);

        list.show();
    }
}