package pgdp.collections;

public class Checkout {

    private Queue<PenguinCustomer> queueOfPenguins = new LinkedQueue<>();
    private Queue<FishyProduct> BandBeforeCashier = new LinkedQueue<>();
    private Queue<FishyProduct> BandAfterCashier = new LinkedQueue<>();

    public Checkout() {

    }

    public Queue<PenguinCustomer> getQueue(){
        return queueOfPenguins;
    }

    public Queue<FishyProduct> getBandBeforeCashier(){
        return BandBeforeCashier;
    }
    public Queue<FishyProduct> getBandAfterCashier(){
        return BandAfterCashier;
    }
    public int queueLength(){
        return queueOfPenguins.size();
    }

    private int gatherprice(){
        int i = 0;
        if (getBandBeforeCashier().size() == 0) return 0;
        else if (getBandBeforeCashier().size() > 0){
            FishyProduct temp = getBandBeforeCashier().dequeue();
            i += temp.getPrice();
            BandAfterCashier.enqueue(temp);
            return i + gatherprice();
        }
        return i;
    }
    public void serveNextCustomer(){
        if (queueLength() == 0)
            return;
        PenguinCustomer servingPenguin = queueOfPenguins.dequeue();
        servingPenguin.placeAllProductsOnBand(BandBeforeCashier);

        int moneyShouldPay = gatherprice();
        servingPenguin.takeAllProductsFromBand(BandAfterCashier);
//        System.out.println(moneyShouldPay);
//
//        if (moneyShouldPay > servingPenguin.getMoney())
//            ExceptionUtil.illegalArgument("Not Enough Money");

        servingPenguin.pay(moneyShouldPay);



    }


    @Override
    public String toString() {
        return "Checkout [" +
                "queueOfPenguins=" + queueOfPenguins +
                ", BandBeforeCashier=" + BandBeforeCashier +
                ", BandAfterCashier=" + BandAfterCashier +
                ']';
    }
}
