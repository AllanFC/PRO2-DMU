package Ex01b;


import java.util.NoSuchElementException;

public class DoubleLinkedQueue<E> implements QueueI<E>{
    private Node header;
    private Node trailer;
    private int size;

    public DoubleLinkedQueue() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        size = 0;
    }

    @Override
    public void add(E entry) {
        Node newNode = new Node(entry);
        newNode.next = trailer;
        newNode.prev = trailer.prev;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    @Override
    public E remove() {
        if(header == trailer){
            throw new NoSuchElementException();
        }
        E popped = header.next.entry;
        header.next = header.next.next;
        header.next.prev = header;
        size--;
        return popped;
    }

    @Override
    public E element() {
        if(header == trailer){
            throw new NoSuchElementException();
        }
        return header.next.entry;
    }

    @Override
    public boolean isEmpty() {
        return header == trailer;
    }

    @Override
    public void clear() {
        header.next = trailer;
        trailer.prev = header;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if(header.next == trailer){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Node node = header.next;
        while(node != trailer){
            sb.append(node.entry).append("\n");
            node = node.next;
        }
        if(sb.toString().equals("")){
            sb.append("Empty");
        }
        return sb.toString();
    }

    //--------------------------------------------------

    private class Node {
        private E entry;
        private Node prev;
        private Node next;

        public Node(E entry) {
            this.entry = entry;
            this.prev = null;
            this.next = null;
        }
    }
}
