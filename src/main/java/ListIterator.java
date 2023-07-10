import java.util.Iterator;

public class ListIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] values;

    public ListIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
