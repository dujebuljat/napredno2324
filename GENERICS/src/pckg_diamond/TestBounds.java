package pckg_diamond;

public class TestBounds {

    public static void main(String[] args) {

        User user = new User("Roberta");
        BestUser bestUser = new BestUser("Filip");
        BoundedCLS<BestUser> bestUserBoundedCLS = new BoundedCLS<>(bestUser);
        bestUserBoundedCLS.performSomething();
        BoundedCLS<User> userBoundedCLS = new BoundedCLS<>(user);
        userBoundedCLS.performSomething();
    }
}
