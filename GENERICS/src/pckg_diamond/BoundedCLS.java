package pckg_diamond;

public class BoundedCLS <T extends User> {

    private T someUser;

    public BoundedCLS(T user) {
        this.someUser = user;
    }

    public void performSomething() {
        someUser.performSomething();
    }
}
