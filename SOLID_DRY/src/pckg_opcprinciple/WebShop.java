package pckg_opcprinciple;

public class WebShop {

    private Payment payment;

    public WebShop() {
        this.payment = payment;
    }

    public void performBuyAndPay(float amount, int choice) {
        switch(choice) {
            case 1: payment.payWithCash(amount); break;
            case 2: payment.payWithPayPal(amount); break;
            case 3: payment.payWithCard(amount); break;
            default: throw new IllegalArgumentException();
        }
    }
}
