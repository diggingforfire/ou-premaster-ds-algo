package diggingforfire;

public class Main {

    public static void main(String[] args) {
	    SinglyLinkedList<String> list = new SinglyLinkedList<>();

	    list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");

        int count = list.recursiveCount();
    }


}
