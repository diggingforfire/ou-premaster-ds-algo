package diggingforfire;


public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }

        return head.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }

        return tail.getElement();
    }

    public E secondToLast() {
        if (isEmpty()) {
            return null;
        }

        if (size <= 2) {
            return head.getElement();
        }

        Node<E> previous = null;

        for (Node<E> node = head; node.getNext() != null; node = node.getNext()) {
            previous = node;
        }

        return previous.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);

        if (size == 0) {
            tail = head;
        }

        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }

        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        E answer = head.getElement();
        head = head.getNext();
        size--;

        if (size == 0) {
            tail = null;
        }

        return answer;
    }

    public int recursiveCount() {
        if (isEmpty()) {
            return 0;
        }

        return recursiveCountInternal(head, 0);
    }

    private int recursiveCountInternal(Node<E> node, int count) {
        if (node.getNext() == null) {
            return ++count;
        }

        return recursiveCountInternal(node.getNext(), ++count);
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> node) {
            this.element = element;
            this.next = node;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> node) {
            next = node;
        }
    }
}