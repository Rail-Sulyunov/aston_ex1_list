import java.util.Iterator;

public class CustomListIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] values;
    public CustomListIterator(E[] values){
        this.values = values;
    }


    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public E next() {
        return values[index++];
    }
}
