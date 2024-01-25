package pckg_icecream;

public class WhiteChocolateDecorator extends IceCreamDecorator{


    protected WhiteChocolateDecorator(BaseIceCream baseIceCream, int amount, double unitPrice) {
        super(baseIceCream, amount, unitPrice);
    }

    @Override
    public void iceCreamDescription() {
        this.iceCream.iceCreamDescription();
        System.out.println("Decorated with: " + getClass().getSimpleName());
    }

    @Override
    public void makeIceCream() {
        System.out.println("Making decoration...");
    }

    @Override
    public double getPrice() {
        return this.iceCream.getPrice() + unitPrice*amount;
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
