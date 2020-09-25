package diggingforfire;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        for (char c  = 'a'; c <= 'y'; c++) {
            list.addLast(String.valueOf(c));
        }

        String middle = list.middle(); // 'l'
    }
}
