package pckg_icecream;

public class ChocolateIceCream extends BaseIceCream {



    protected ChocolateIceCream(int amount, double unitPrice) {
        super(amount, unitPrice);
    }

    @Override
    public void iceCreamDescription() {
        System.out.println(getClass().getSimpleName() + " amount: " + amount);
    }

    @Override
    public void makeIceCream() {
        System.out.println("Making: " + getClass().getSimpleName());
    }

    @Override
    public double getPrice() {
        return amount*unitPrice;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
