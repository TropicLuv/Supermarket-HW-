package pgdp.collections;

public class FishyProduct {
    private final String name;
    private final int price;

    public FishyProduct(String name, int price) {
        if(name==null || price<1)
            ExceptionUtil.illegalArgument("nothing");

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "(" +
                name + ", "+
                price +
                ')';
    }


    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }


}

