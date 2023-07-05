import java.util.Iterator;

public class List<E> implements ListMethods<E> {

    public static void main(String[] args) {


    }

    private E[] values;

    public  List() {
        values = (E[]) new Object[0];
    }

    @Override
    public  boolean add(E e) {
        try {
            E[] x = values;
            values = (E[]) new Object[x.length + 1];
            System.arraycopy(x, 0, values, 0, x.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] x = values;
            values = (E[]) new Object[x.length - 1];
            System.arraycopy(x, 0, values, 0, index);
            int count = x.length - index - 1;
            System.arraycopy(x, index + 1, values, index, count);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(values);
    }
}
