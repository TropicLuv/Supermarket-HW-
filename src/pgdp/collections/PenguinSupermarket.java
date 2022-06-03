package pgdp.collections;
//import java.util.Arrays;
public class PenguinSupermarket{

    private Checkout [] checkouts;


    public Checkout[] GetCheckouts() {
        return checkouts;
    }

    public PenguinSupermarket(int numOfRegisters) {
        if(numOfRegisters < 1) ExceptionUtil.illegalArgument("num < 0");
        checkouts = new Checkout[numOfRegisters];
        for(int i = 0; i < checkouts.length; i++)
            checkouts[i] = new Checkout();

    }

    public Checkout getCheckoutWithSmallestQueue(){
//        if (checkouts.length == 0) return null;
//        if (checkouts.length == 1) return checkouts[0];
        int smallestRegister = 0;
        int queueLength = checkouts[0].queueLength();
        for (int i = 1; i < checkouts.length; i++){
            if (queueLength > checkouts[i].queueLength()) {
                queueLength = checkouts[i].queueLength();
                smallestRegister = i;
            }
        }
        return checkouts[smallestRegister];
    }

    public void closeCheckout(int index){
        if (index < 0 || checkouts.length == 1 || index >= checkouts.length) ExceptionUtil.illegalArgument("error");

        Checkout tempCheckout = checkouts[index];
        Checkout [] newCheckoutsArr = new Checkout[checkouts.length - 1];

        for (int i = 0; i < checkouts.length-1; i++) {
            if (i < index){
                newCheckoutsArr[i] = checkouts[i];
            }else
                newCheckoutsArr[i] = checkouts[i+1];
        }

        checkouts = newCheckoutsArr;
        if (tempCheckout.queueLength() == 0) return;
        Stack<PenguinCustomer> tempStack = new LinkedStack<>();
        DataStructureLink<PenguinCustomer> perenos = new DataStructureLink<>(new QueueConnector<PenguinCustomer>(tempCheckout.getQueue()),new StackConnector<PenguinCustomer>(tempStack));
        perenos.moveAllFromAToB();

        while(tempStack.size() != 0)
            tempStack.pop().goToCheckout(this);

    }
    public void serveCustomers() {
        if (checkouts.length == 0) ExceptionUtil.illegalArgument("No registers");
//        Arrays.stream(checkouts).forEach(Checkout::serveNextCustomer);
        for (Checkout checkout : checkouts) {
            checkout.serveNextCustomer();
        }
    }


//    @Override
//    public String toString() {
//        return "PenguinSupermarket [" +
//                "Registers: " + Arrays.toString(checkouts) +
//                ']';
//    }


}
