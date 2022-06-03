//package pgdp.collections;
//
//import java.util.Arrays;
//
//public class PenguinSupermarket1 {
//    private Checkout[] checkouts;
//
//    public Checkout[] getCheckouts(){
//        return checkouts;
//    }
//
//    public PenguinSupermarket1(int checkoutNumber){
//        if(checkoutNumber <= 0){
//            ExceptionUtil.illegalArgument("checkout number <= 0");
//        }
//        checkouts = new Checkout[checkoutNumber];
//        for (int i = 0; i < checkoutNumber; i++) {
//            checkouts[i] = new Checkout();
//        }
//    }
//
//    public Checkout getCheckoutWithSmallestQueue(){
//        Checkout retCheckout = checkouts[0];
//        int qNumber = checkouts[0].queueLength();
//
//        for (int i = 1; i < checkouts.length ; i++){
//            if(checkouts[i].queueLength() < qNumber){
//                retCheckout = checkouts[i];
//                qNumber = retCheckout.queueLength();
//            }
//        }
//
//        return retCheckout;
//    }
//    public void closeCheckout(int index){
//        if(index >= checkouts.length){
//            ExceptionUtil.illegalArgument("checkout of index:" + index + " does not exist");
//            return;
//        }
//
//        Checkout closedCheckout = checkouts[index];
//
//        Checkout[] newChekoutArray = new Checkout[checkouts.length - 1];
//
//        int k = 0;
//
//        for (int i = 0; i < checkouts.length ; i++){
//            if(i != index){
//                newChekoutArray[k] = checkouts[i];
//                k++;
//            }
//        }
//
//        checkouts = newChekoutArray;
//
//        if(closedCheckout.queueLength() == 0){
//            return;
//        }
//
//        Stack<PenguinCustomer> stackOfCustomers = new LinkedStack<>();
//
//        DataStructureConnector<PenguinCustomer> firstStructure = new QueueConnector<>(closedCheckout.getQueue());
//        DataStructureConnector<PenguinCustomer> secondStructure = new StackConnector<>(stackOfCustomers);
//        DataStructureLink<PenguinCustomer> combiner = new DataStructureLink<>(firstStructure,secondStructure);
//        combiner.moveAllFromAToB();
//
//        while (!stackOfCustomers.isEmpty()){
//            PenguinCustomer currCustomer = stackOfCustomers.pop();
//            currCustomer.goToCheckout(this);
//        }
//
//    }
//
//    public void serveCustomers(){
//        for (int i = 0; i < checkouts.length ; i++){
//            checkouts[i].serveNextCustomer();
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "PenguinSupermarket{" +
//                "checkouts=" + Arrays.toString(checkouts) +
//                '}';
//    }
//
//}