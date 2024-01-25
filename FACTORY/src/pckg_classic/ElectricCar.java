package pckg_classic;

import pckg_classic.Car;

import java.awt.*;

public class ElectricCar extends Car {
    public ElectricCar() {
        this.type = "ElectricCar";
    }

    @Override
    public void manufactureCar() {

        System.out.println("Manufacturing -> " + getClass().getSimpleName());

    }

    @Override
    public void assembleCar() {

        System.out.println("Assemble all parts for -> " + getClass().getSimpleName());

    }

    @Override
    public void paintCar(Color color) {

        System.out.println("Paint the body in color -> " + color);

    }

    @Override
    public void testCar() {

        System.out.println("Car: " + getClass().getSimpleName() + " is delivered!");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
