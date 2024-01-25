package duck_sim_pckg;

public class QuackSimple implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Simple Quack, Quack,...");
    }
}
