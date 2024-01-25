package pckg_opcprinciple;

public class WebShopSND {

    private PaymentPrinciple payment;

    public void setPayment(PaymentPrinciple payment) {
        this.payment = payment;
    }

    public void buySomething(float amount) {
        payment.performPayment(amount);
    }
}
