package pgdp.collections;

public class LinkedStack<T> implements Stack<T> {
    private List<T> element;

//    public List<T> getElement() {
//        return element;
//    }

    @Override
    public int size() {
        if (element == null)
            return 0;
        return element.length();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void push(T x) {
            if (x == null) return;

        element = new List<T> (x,element);
    }

    @Override
    public T pop() {
        if (this.size() == 0) return null;

        T popedElement = element.getInfo();
        element = element.getNext();
        return popedElement;
    }

    @Override
    public String toString() {
        return "[" +
                element +
                ']';
    }
}
