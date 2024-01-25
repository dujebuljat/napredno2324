package duck_sim_pckg;

public class FlyNO implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly - just walk and swim...");
    }
}
