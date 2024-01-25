package pckg_factory_method;

import java.awt.*;

public abstract class CarProduct {

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
