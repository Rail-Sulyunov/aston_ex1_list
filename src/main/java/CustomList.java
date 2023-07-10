public interface CustomList<E> extends Iterable<E> {
    /**
     * This method should add a new item into the <code>CustomList</code> and should
     * return <code>true</code> if it was successfully able to insert an item.
     *
     * @param e the item to be added to the <code>CustomList</code>
     * @return <code>true</code> if item was successfully added, <code>false</code> if the item was not successfully added.
     * * @throws ClassCastException ex
     */
    boolean add(E e);

    /**
     * This method should remove an item from the <code>CustomList</code> at the
     * <p>
     * specified index. This will NOT leave an empty <code>null</code> where the item
     * <p>
     * was removed, instead all other items to the right will be shuffled to the left.
     *
     * @param index the index of the item to remove
     * @throws ClassCastException ex
     */
    void delete(int index);

    /**
     * This method will return the actual element from the <code>CustomList</code> based on the
     * <p>
     * index that is passed in.
     *
     * @param index represents the position in the backing <code>Object</code> array that we want to access
     * @return The element that is stored inside of the <code>CustomList</code> at the given index
     */

    E get(int index);

    /**
     * This method should return the size of the <code>CustomList</code>
     * based on the number of actual elements stored inside of the <code>CustomList</code>
     *
     * @return an <code>int</code> representing the@Override
     * number of elements stored in the <code>CustomList</code>
     */
    int size();

    /**
     * This method changes the element in <code>CustomList</code>
     * specified
     * @param index
     * @param e the element to be inserted into the <code>CustomList</code>
     */
    void update(int index, E e);
}
