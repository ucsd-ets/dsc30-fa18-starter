import java.util.*;

public class dHeap<T extends Comparable<? super T>>
        implements dHeapInterface<T> {

    private T[] heap; //heap array
    private int d; //branching factor
    private int nelems;
    private boolean isMaxHeap; //boolean to indicate whether heap is max or min

    /**
     * Initializes a binary max heap with capacity = 9
     */
    public dHeap() {

    }

    /**
     * Initializes a binary max heap with a given initial capacity.
     *
     * @param heapSize The initial capacity of the heap.
     */
    public dHeap(int heapSize) {

    }

    /**
     * Initializes a d-ary heap (with a given value for d), with a given initial
     * capacity.
     *
     * @param d The number of child nodes each node in the heap should have.
     * @param heapSize The initial capacity of the heap.
     * @param isMaxHeap indicates whether the heap should be max or min
     * @throws IllegalArgumentException if d is less than one.
     */
    @SuppressWarnings("unchecked")
    public dHeap(int d, int heapSize, boolean isMaxHeap)
            throws IllegalArgumentException {

    }

    @Override
    public int size() {
        return -1; //XXX-CHANGE-XXX

    }

    @Override
    public void add(T data) throws NullPointerException {
        //TODO
    }

    @Override
    public T remove() throws NoSuchElementException {
        return null; //XXX-CHANGE-XXX
    }

    @Override
    public void clear() {
        //TODO
    }

    @Override
    public T element() {
        return null; ////XXX-CHANGE-XXX
    }
}
