package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T>{
    private Stack<T> stackElement = null;

    public StackConnector(Stack<T> stackElement) {
        this.stackElement = stackElement;
    }

    @Override
    public boolean hasNextElement() {
        return (!(this.stackElement.size() == 0));
    }

    @Override
    public void addElement(T x) {
        stackElement.push(x);
    }

    @Override
    public T removeNextElement() {
        return stackElement.pop();
    }
}
