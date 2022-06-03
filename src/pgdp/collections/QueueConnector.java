package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T>{
    private Queue<T> queueElement = null;

    public QueueConnector(Queue<T> queueElement) {
        this.queueElement = queueElement;
    }

    @Override
    public boolean hasNextElement() {
        return (!(this.queueElement.size() == 0));
    }

    @Override
    public void addElement(T x) {
        queueElement.enqueue(x);
    }

    @Override
    public T removeNextElement() {
        return queueElement.dequeue();
    }
}