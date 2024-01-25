package duck_sim_pckg;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying using a rocket!!!");
    }
}
