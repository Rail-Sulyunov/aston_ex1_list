import java.util.Iterator;
/**
 * Class for creating a dynamic array
 * @param <E>
 */
public class CustomArrayList<E> implements CustomList<E> {


    private E[] values;

    public CustomArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
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

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(values);
    }


    /**
     * The Constant QuickSortCUTOFF.
     */
    private static final int QuickSortCUTOFF = 10;

    public static void quicksort(Comparable[] a) {
        quicksort(a, 0, a.length - 1);
    }

    /**
     * Internal quicksort method that makes recursive calls.
     * Uses median-of-three partitioning and a cutoff of 10.
     *
     * @param a    an array of Comparable items.
     * @param low  the left-most index of the subarray.
     * @param high the right-most index of the subarray.
     */
    private static void quicksort(Comparable[] a, int low, int high) {
        if (low + QuickSortCUTOFF > high)
            insertionSort(a, low, high);
        else {
            // Sort low, middle, high
            int middle = (low + high) / 2;
            if (a[middle].compareTo(a[low]) < 0)
                swapReferences(a, low, middle);
            if (a[high].compareTo(a[low]) < 0)
                swapReferences(a, low, high);
            if (a[high].compareTo(a[middle]) < 0)
                swapReferences(a, middle, high);

            // Place pivot at position high - 1
            swapReferences(a, middle, high - 1);
            Comparable pivot = a[high - 1];

            // Begin partitioning
            int i, j;
            for (i = low, j = high - 1; ; ) {
                while (a[++i].compareTo(pivot) < 0)
                    ;
                while (pivot.compareTo(a[--j]) < 0)
                    ;
                if (i >= j)
                    break;
                swapReferences(a, i, j);
            }

            swapReferences(a, i, high - 1);

            quicksort(a, low, i - 1); // Sort small elements
            quicksort(a, i + 1, high); // Sort large elements
        }
    }

    /**
     * Internal insertion sort routine for subarrays
     * that is used by quicksort.
     *
     * @param a    an array of Comparable items.
     * @param low  the left-most index of the subarray.
     * @param high the high
     */
    private static void insertionSort(Comparable[] a, int low, int high) {
        for (int p = low + 1; p <= high; p++) {
            Comparable tmp = a[p];
            int j;

            for (j = p; j > low && tmp.compareTo(a[j - 1]) < 0; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    /**
     * Method to swap to elements in an array.
     *
     * @param a      an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    public static final void swapReferences(Object[] a, int index1,
                                            int index2) {
        Object tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }
}



