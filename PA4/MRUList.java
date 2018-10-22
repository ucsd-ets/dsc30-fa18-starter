import java.util.LinkedList;

/**
 * This class defines a Most Recently Used List
 * @param <T> the given type that stores in MRUList
 */
public class MRUList<T> extends LinkedList<T> {

    /**
     * Add a given data to the list. Add will always put the data at the front of the list.
     *
     * @param data the given data
     * @return true in all cases
     */
    @Override
    public boolean add(T data) throws NullPointerException {
        if (data == null) {
            throw new NullPointerException();
        }
        super.add(0, data);
        return true;
    }

    /**
     * When checking whether an MRUList contains an element, once we find that element,
     * we will remove that element from its position in the list, and add it to the front.
     *
     * @param o the given element
     * @return true if MRUList contains the given element, false otherwise.
     */
    @Override
    public boolean contains(Object o) throws NullPointerException {
        if (o == null) {
            throw new NullPointerException();
        }
        if (super.removeFirstOccurrence(o)) {
            add((T) o);
            return true;
        }
        return false;
    }
}
