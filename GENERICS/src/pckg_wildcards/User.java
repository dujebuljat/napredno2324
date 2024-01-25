package pckg_wildcards;

public class User {

    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void performSomething() {
        System.out.println(this.getClass().getSimpleName() + " performing fundamentals!");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
