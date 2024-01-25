package pckg_classic;

import java.awt.*;

public abstract class Car {

    protected String type;

    public abstract void manufactureCar();

    public abstract void assembleCar();

    public abstract void paintCar(Color color);

    public abstract void testCar();

    public void driveCar() {
        System.out.println("Car: " + getClass().getSimpleName() + " is driven!");
    }

    public void deliverCar() {
        System.out.println("Car: " + getClass().getSimpleName() + " is delivered!");
    }
}
