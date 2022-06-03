package pgdp.collections;


public class Main{
    public static void main(String[] args) {


        /////////////////////
//        FishyProduct a1 = new FishyProduct("Micro Mac with Soft Fish1111111111", 1);
//        FishyProduct a2 = new FishyProduct("Micro Mac with Soft Fish111111111", 2);
//        FishyProduct b1 = new FishyProduct("Micro Mac with Soft Fish22222222", 1);
//        FishyProduct b2 = new FishyProduct("Micro Mac with Soft Fish22222222", 1);
//        FishyProduct c1 = new FishyProduct("Micro Mac with Soft Fish333333333", 1);
//        FishyProduct c2 = new FishyProduct("Micro Mac with Soft Fish33333333", 1);
//
//        PenguinCustomer Customer = new PenguinCustomer("Pingu1", 3);
//        Customer.addProductToBasket(a1);
//        Customer.addProductToBasket(a2);
//
//        PenguinCustomer Customer2 = new PenguinCustomer("Pingu2", 3);
//        Customer2.addProductToBasket(b1);
//        Customer2.addProductToBasket(b2);
//        PenguinCustomer Customer3 = new PenguinCustomer("Pingu3", 5);
//        Customer2.addProductToBasket(c1);
//        Customer2.addProductToBasket(c2);
//
//
//
//        PenguinSupermarket supermarket = new PenguinSupermarket(6);
//        Customer.goToCheckout(supermarket);
//        Customer2.goToCheckout(supermarket);
//        Customer3.goToCheckout(supermarket);
//
//
//
//
//
//
//
//        FishyProduct z =new FishyProduct("Micro Mac with Soft Fish", 337);
//        PenguinCustomer x=    new PenguinCustomer("Tux", 1337);
//        x.addProductToBasket(z);
//
//        x.goToCheckout(supermarket);
//        System.out.println(Customer.getMoney());
//        System.out.println(Customer2.getMoney());
//        System.out.println(Customer3.getMoney());
//        System.out.println(x.getMoney());
//        supermarket.closeCheckout(5);
//        supermarket.closeCheckout(4);
//        supermarket.closeCheckout(1);
//        System.out.println(supermarket.toString());
//        supermarket.serveCustomers();
//        System.out.println(Customer.getMoney());
//        System.out.println(Customer2.getMoney());
//        System.out.println(Customer3.getMoney());
//        System.out.println(x.getMoney());
//
//        Customer3.goToCheckout(supermarket);
//        Customer.goToCheckout(supermarket);
        PenguinCustomer penguinCustomer = new PenguinCustomer("Luka", 1254);
        PenguinCustomer penguinCustomer1 = new PenguinCustomer("Dato", 892);
        PenguinCustomer penguinCustomer2 = new PenguinCustomer("Nino", 1000);
        PenguinCustomer penguinCustomer3 = new PenguinCustomer("Guja", 900);

        FishyProduct fishyProduct = new FishyProduct("ikra", 224);
        FishyProduct fishyProduct1 = new FishyProduct("shproti", 16);
        FishyProduct fishyProduct2 = new FishyProduct("zutxi", 359);

        penguinCustomer.addProductToBasket(fishyProduct);
        penguinCustomer.addProductToBasket(fishyProduct1);
        penguinCustomer.addProductToBasket(fishyProduct2);

        penguinCustomer1.addProductToBasket(fishyProduct);
        penguinCustomer1.addProductToBasket(fishyProduct2);

        penguinCustomer2.addProductToBasket(fishyProduct1);
        penguinCustomer2.addProductToBasket(fishyProduct2);

        penguinCustomer3.addProductToBasket(fishyProduct);
        penguinCustomer3.addProductToBasket(fishyProduct1);

        PenguinSupermarket penguinSupermarket = new PenguinSupermarket(3);
        penguinCustomer.goToCheckout(penguinSupermarket);
        penguinCustomer1.goToCheckout(penguinSupermarket);
        penguinCustomer2.goToCheckout(penguinSupermarket);
        penguinCustomer3.goToCheckout(penguinSupermarket);
        //        penguinSupermarket.serveCustomers();
        System.out.println(penguinCustomer.getMoney());
        System.out.println(penguinCustomer1.getMoney());
        System.out.println(penguinCustomer2.getMoney());
        System.out.println(penguinCustomer3.getMoney());
        penguinSupermarket.closeCheckout(1);
        penguinSupermarket.serveCustomers();
        penguinSupermarket.serveCustomers();
        System.out.println(penguinCustomer.getMoney());
        System.out.println(penguinCustomer1.getMoney());
        System.out.println(penguinCustomer2.getMoney());
        System.out.println(penguinCustomer3.getMoney());






    }
}
