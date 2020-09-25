package diggingforfire;

public class DoublyLinkedList<E> {

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
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
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }

        return trailer.getPrevious().getElement();
    }

    public void addFirst(E element) {
        addBetween(element, header, header.getNext());
    }

    public void addLast(E element) {
        addBetween(element, trailer.getPrevious(), trailer);
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()){
            return null;
        }

        return remove(trailer.getPrevious());
    }

    public E middle() {
        if (isEmpty()) {
            return null;
        }

        Node<E> middle = header.getNext();

        for (int i = 1; i < size / 2; i++) {
            middle = middle.getNext();
        }

        return middle.getElement();
    }

    private void addBetween(E element, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new Node<>(element, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrevious(newest);
        size++;
    }

    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrevious();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrevious(predecessor);
        size--;
        return node.getElement();
    }

    private static class Node<E> {
        private E element;
        private Node<E> previous;
        private Node<E> next;

        public Node(E element, Node<E> previous, Node<E> next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
