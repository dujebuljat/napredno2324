package duck_sim_pckg;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can not produce any sound!!!");
    }
}
