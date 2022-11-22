package Ex01;


public class SortedLinkedList {
    private Node first;

    public SortedLinkedList() {
        first = null;
    }

    /**
     * Add the element to the list.
     * The list is still sorted after the element is added.
     */
    public void add(String element) {
        if(first == null || first.data.compareTo(element) > 0){ // guard
            Node newNode = new Node(element);
            newNode.next = first;
            first = newNode;
            return;
        }

        boolean placed = false;
        Node node = first;
        while(!placed && node.next != null){
            if(node.next.data.compareTo(element) >= 0){ // place in front of greater or strings equal to element
                Node newnode = new Node(element);
                newnode.next = node.next;
                node.next = newnode;
                placed = true;
            }
            node = node.next;
        }
        if(!placed){
            node.next = new Node(element);
        }
    }
    /**
     * Remove the last element from the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed, otherwise false.
     */

    public boolean removeLast(){
        if(first == null){ // guard
            return false;
        }

        if(first.next == null){ // guard
            first = null;
            return true;
        }

        Node node = first;
        while(node.next != null){
            if(node.next.next == null){
                node.next = null;
                return true;
            }
            node = node.next;
        }
        return false;
    }
    /**
     * Remove the first instance of the element from the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed, otherwise false.
     */
    public boolean remove(String element){
        if (first == null)
            return false;

        if (first.data.equals(element)) {
            first = first.next;
            return true;
        }

        // update node to reference the node BEFORE the node
        // containing the city (if such a node exists)
        Node node = first;
        while (node.next != null && !node.next.data.equals(element)) {
            node = node.next;
        }
        if (node.next != null) {
            node.next = node.next.next;
            return true;
        }
        return false;
    }

    /**
     * Print all elements in alphabetical order.
     */
    public void printElements() {
        if(first == null){
            System.out.println("Empty list");
            return;
        }
        Node node = first;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    /**
     * Return the count of elements in the list.
     */
    public int count() {
        int count = 0;
        if(first == null){
            return 0;
        }

        Node node = first;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }

    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
}
