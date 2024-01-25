package duck_sim_pckg;

public class RubberDuck extends Duck{
    public RubberDuck() {
        this.flyBehavior = new FlyNO();
        this.quackBehavior = new SqueakSound();
        this.swimBehavior = new SwimNO();
    }
    @Override
    protected void performFlying() {
        flyBehavior.fly();
    }

    @Override
    protected void performQuack() {
        quackBehavior.quack();
    }

    @Override
    protected void performSwim() {
        swimBehavior.swim();
    }
}
