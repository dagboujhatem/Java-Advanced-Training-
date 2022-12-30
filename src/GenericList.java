import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    private T[] items = (T[]) new Object[5];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    // class imbriqué
    private class ListIterator implements Iterator<T>{

        private GenericList<T> list;
        private int iteratorIndex;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return this.iteratorIndex < this.list.count;
        }

        @Override
        public T next() {
            return list.get(this.iteratorIndex++);
        }
    }
}
