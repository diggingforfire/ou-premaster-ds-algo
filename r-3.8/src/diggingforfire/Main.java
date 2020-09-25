package diggingforfire;

public class Main {

    public static void main(String[] args) {
	    CircularlyLinkedList<String> list = new CircularlyLinkedList<String>();

        for (char c  = 'a'; c <= 'b'; c++) {
            list.addLast(String.valueOf(c));
        }

        int count = list.count();
    }
}
