public class GenericList<T extends Comparable & Cloneable> {
    private T[] items = (T[]) new Comparable[5];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
