package duck_sim_pckg;

import java.util.ArrayList;

public class DuckSimulator {

    private static ArrayList<Duck> ducks = new ArrayList<>();

    public static void main(String[] args) {

        ducks.add(new WildDuck());
        ducks.add(new RubberDuck());
        ducks.add(new WildDuck());
        simulate();
    }

    private static void simulate() {
        for(Duck duck : ducks) {
            duck.performFlying();
            duck.performQuack();
            duck.performSwim();
            duck.display();
            System.out.println("=====================================");
        }
    }
}
