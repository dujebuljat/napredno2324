package duck_sim_pckg;

public class SqueakSound implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak, squeak, again squeak...");
    }
}
