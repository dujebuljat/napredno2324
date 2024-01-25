package pckg_diamond;

public class BestUser extends User {
    public BestUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        System.out.println("Performing same as base User...");
        super.performSomething();
        System.out.println(getClass().getSimpleName() + " performing something additional!");
    }
}
