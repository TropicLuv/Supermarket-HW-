package pgdp.collections;

public class LinkedQueue<T> implements Queue<T>{

    private List<T> first,last;

//    public List<T> getElement() {
//        return first;
//    }

    @Override
    public int size() {
        if (isEmpty())
            return 0;
        return first.length();
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void enqueue(T x) {

        if (x == null) return;
        if (isEmpty())
            first = last = new List<T>(x);
        else {
            last.insert(x);
            last = last.getNext();
        }
    }

    @Override
    public T dequeue() {

        if (isEmpty())
            return null;
        T result = first.getInfo();
        if (first == last) {
            last = null;
        }
        first = first.getNext();
        return result;

    }

    @Override
    public String toString() {
        return "["  + first + "]";
    }
}
