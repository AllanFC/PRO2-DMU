package Ex02;

/**
 * HashSetSC implements a hash set using separate chaining.
 * Note: null is not allowed as an element in the set.
 */
public class HashSetSC<E> {
    // the hash table where each entry contains
    // a collection of elements with the same hash value;
    // collections are implemented as a single linked lists
    private Node<E>[] table;
    // the number of elements in the hash set
    private int size;

    /**
     * Create a new HashSetSC with the given table length.
     * Note: The table length must be a prime number.
     */
    public HashSetSC(int tableLength) {
        @SuppressWarnings("unchecked")
        Node<E>[] emptyTable = (Node<E>[]) new Node[tableLength];
        table = emptyTable;
        size = 0;
    }

    private int hash(E element) {
        int h = element.hashCode();
        if (h < 0) h = -h;
        h = h % table.length;
        return h;
    }

    /**
     * Return true, if element is in the set.
     */
    public boolean contains(E element) {
        if(size == 0){
            return false;
        }

        int hash = element.hashCode();
        Node<E> node = table[hash];
        while(node != null){
            if(node.data == element){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * Add element to this set.
     * Return true, if the element is added to the set.
     * Throw IllegalArgumentException, if element is null.
     */
    public boolean add(E element) {
        if(element == null){
            throw new IllegalArgumentException();
        }

        int hash = this.hash(element);
        if(table[hash] == null){
            Node<E> newNode = new Node<>(element);
            table[hash] = newNode;
            size++;
            return true;
        }

        Node<E> node = table[hash];
        while(node != null){
            if(node.data == element){
                return false;
            }
            node = node.next;
        }

        Node<E> newNode = new Node<>(element);
        newNode.next = table[hash];
        table[hash] = newNode;
        size++;
        return true;
    }

    /**
     * Remove element from the set.
     * Return true, if the element is removed from the set.
     */
    public boolean remove(E element) {
        int hash = this.hash(element);
        if(table[hash] == null){
            return false;
        }

        if(table[hash].data == element){
            table[hash] = table[hash].next;
            size--;
            return true;
        }

        Node<E> node = table[hash];
        while(node.next != null && node.next.data != element){
            node = node.next;
        }
        if(node.next == null){
            return false;
        }
        node.next = node.next.next;
        size--;
        return true;
    }

    /**
     * Return the number of elements in this set.
     */
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while(i < table.length){
            if(table[i] != null){
                Node<E> node = table[i];
                while(node != null){
                    sb.append(", ").append(node.data);
                    node = node.next;
                }
            }
            i++;
        }
        sb.delete(1,3);
        sb.append("]");
        return sb.toString();
    }

    //-------------------------------------------------------------------------

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
