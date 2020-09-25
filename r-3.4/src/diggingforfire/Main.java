package diggingforfire;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        for (char c  = 'a'; c <= 'y'; c++) {
            list.addLast(String.valueOf(c));
        }

        String secondToLast = list.secondToLast(); // 'y'
    }
}
