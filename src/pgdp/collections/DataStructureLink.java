package pgdp.collections;

public class DataStructureLink <T>{

    private DataStructureConnector<T> firstConnector = null;
    private DataStructureConnector<T> secondConnector = null;

    public DataStructureLink(DataStructureConnector<T> firstConnector, DataStructureConnector<T> secondConnector) {
        this.firstConnector = firstConnector;
        this.secondConnector = secondConnector;
    }

    public boolean moveNextFromAToB(){

        if (!firstConnector.hasNextElement())
            return false;
        secondConnector.addElement(firstConnector.removeNextElement());
        return true;
    }
    public void moveAllFromAToB(){
        if (!firstConnector.hasNextElement())
            return;
        moveNextFromAToB();
        moveAllFromAToB();
    }
}
