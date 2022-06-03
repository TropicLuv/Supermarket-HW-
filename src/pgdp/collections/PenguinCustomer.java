package pgdp.collections;

public class PenguinCustomer {
    private final String name;
    private int initialMoney;
    private Stack<FishyProduct> products = new LinkedStack<>();

    public PenguinCustomer(String name, int money) {
        if (name == null || money < 0)
            ExceptionUtil.illegalArgument("Not Allowed");
        this.name = name;
        this.initialMoney = money;
    }



    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.initialMoney;
    }

    public Stack<FishyProduct> getProducts() {
        return this.products;
    }

    public void addProductToBasket(FishyProduct product){
        products.push(product);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> bandProducts){
        DataStructureConnector<FishyProduct> a = new StackConnector<>(products);
        QueueConnector<FishyProduct> b = new QueueConnector<>(bandProducts);
        DataStructureLink<FishyProduct> structureLink = new DataStructureLink<>(a,b);
        structureLink.moveAllFromAToB();

    }

    public void takeAllProductsFromBand(Queue<FishyProduct> bandProducts){
        DataStructureConnector<FishyProduct> a = new StackConnector<>(products);
        QueueConnector<FishyProduct> b = new QueueConnector<>(bandProducts);
        DataStructureLink<FishyProduct> STRUCTURELINK = new DataStructureLink<>(b,a);
        STRUCTURELINK.moveAllFromAToB();
    }

    public void pay(int moneyShouldPay){
        if (moneyShouldPay > initialMoney || moneyShouldPay < 0)
            ExceptionUtil.illegalArgument("Impossible");
        initialMoney -= moneyShouldPay;
    }

    @Override
    public String toString() {
        return "[" +
                "name = " + name +
                ", Money = " + initialMoney +
                ", products = " + products +
                ']';
    }

    public void goToCheckout(PenguinSupermarket kolbasa){
        kolbasa.getCheckoutWithSmallestQueue().getQueue().enqueue(this);
    }
}
