package pckg_opcprinciple;

public class CardPayment implements PaymentPrinciple{
    @Override
    public void performPayment(float amount) {
        System.out.println("Credit Card payment: " + amount);
    }
}
