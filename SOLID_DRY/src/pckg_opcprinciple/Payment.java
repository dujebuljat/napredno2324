package pckg_opcprinciple;

public class Payment {

    public void payWithCard(float amount) {
        System.out.println("Perform card payment: " + amount);
    }

    public void payWithPayPal(float amount) {
        System.out.println("Perform PayPal payment: " + amount);
    }

    public void payWithCash(float amount) {
        System.out.println("Perform cash payment: " + amount);
    }
}
