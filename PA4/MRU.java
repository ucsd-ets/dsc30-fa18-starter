import java.util.AbstractList;

public class MRU<T> extends AbstractList<T> {
    private int nelems;

    private Node head;
    private Node tail;

    /**
     * Node for chaining together to create a linked list
     */
    protected class Node {
        T data;

        Node next;
        Node prev;

        /**
         * Constructor to create singleton Node
         */
        private Node(T element) {
            this(element, null, null);
        }

        /**
         * Constructor to create singleton link it between previous and next
         *
         * @param element  Element to add, can be null
         * @param nextNode successor Node, can be null
         * @param prevNode predecessor Node, can be null
         */
        private Node(T element, Node nextNode, Node prevNode) {
            data = element;
            setNext(nextNode);
            setPrev(prevNode);
        }

        /**
         * Remove this node from the list. Update previous and next nodes
         */
        private void remove() {
            this.getNext().setPrev(this.getPrev());
            this.getPrev().setNext(this.getNext());
        }

        /**
         * Set the previous node in the list
         *
         * @param p new previous node
         */
        private void setPrev(Node p) {
            this.prev = p;
        }

        /**
         * Set the next node in the list
         *
         * @param n new next node
         */
        private void setNext(Node n) {
            this.next = n;

        }

        /**
         * Set the element
         *
         * @param e new element
         */
        public void setElement(T e) {
            this.data = e;
        }

        /**
         * Accessor to get the next Node in the list
         */
        private Node getNext() {
            return this.next;
        }

        /**
         * Accessor to get the prev Node in the list
         */
        private Node getPrev() {

            return this.prev;
        }

        /**
         * Accessor to get the Nodes Element
         */
        private T getElement() {
            return this.data;
        }
    }

    /**
     * Creates a new, empty doubly-linked list.
     */
    public MRU() {
        nelems = 0;
        head = new Node(null);
        tail = new Node(null);
        head.setNext(tail);
        tail.setPrev(head);
    }

    /**
     * Retrieves the amount of elements that are currently on the list.
     *
     * @return Number of elements currently on the list
     */
    @Override
    public int size() {
        return nelems;
    }

    /**
     * Retrieves the element stored with a given index on the list.
     *
     * @param index The index of the desired element.
     * @return The element stored in the Node with the desired index.
     * @throws IndexOutOfBoundsException if index received is out of bounds for
     *                                   the current list.
     */
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= nelems || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node nthNode = this.getNth(index);
        T data = nthNode.getElement();

        return data;
    }


    /**
     * Adds an element to a certain index in the list, shifting exist elements
     * create room. Does not accept null values.
     *
     * @param index Where in the list to add the element.
     * @param data  Data to be added.
     * @throws IndexOutOfBoundsException if index received is out of bounds for
     *                                   the current list.
     * @throws NullPointerException      if data received is null.
     */
    @Override
    public void add(int index, T data){
        this.add(data);
    }


    /**
     * Add an element to the end of the list
     *
     * @param data data to be added
     * @throws NullPointerException if data received is null
     */
    public boolean add(T data) throws NullPointerException {
        if (data == null) {
            throw new NullPointerException();
        }

        Node addNode = new Node(data);
        addNode.setNext(head.getNext());
        addNode.setPrev(head);
        head.getNext().setPrev(addNode);
        head.setNext(addNode);

        nelems++;

        return true;
    }

    /*
     * remove the element from position index in the list
     * @param int index:index where in the list the data should be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if index<0 || index >= size
     */
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= nelems) {
            throw new IndexOutOfBoundsException();
        }
        Node nthNode = this.getNth(index);
        T data = nthNode.getElement();
        nthNode.remove();
        nelems--;
        return data;
    }

    /**
     * Clear the linked list
     */
    public void clear() {
        head.setNext(tail);
        tail.setPrev(head);
        nelems = 0;
    }

    /**
     * Determine if the list empty
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return head.getNext() == tail && tail.getPrev() == head && nelems == 0;
    }

    // Helper method to get the Node at the Nth index
    private Node getNth(int index) {
        Node currentNode = this.head;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public boolean contains(Object data) {
        Node temp = this.head;
        while (temp != this.tail) {
            if (data.equals(temp.getElement())) {
                temp.remove();
                temp.setNext(head.getNext());
                temp.setPrev(head);
                head.getNext().setPrev(temp);
                head.setNext(temp);
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}

