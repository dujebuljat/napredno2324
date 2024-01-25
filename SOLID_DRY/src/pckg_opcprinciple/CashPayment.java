package pckg_opcprinciple;

public class CashPayment implements PaymentPrinciple{
    @Override
    public void performPayment(float amount) {
        System.out.println("Cash payment: " + amount);
    }
}
