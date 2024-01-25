package pckg_opcprinciple;

public class PayPalPayment implements PaymentPrinciple{
    @Override
    public void performPayment(float amount) {
        System.out.println("PayPal payment: " + amount);
    }
}
