package pckg_simple_factory;

import pckg_classic.*;

import javax.management.InvalidAttributeValueException;
import java.awt.*;

public class SimpleCarCreator {

    private Car car;

    public Car createCar(String type) throws InvalidAttributeValueException {


        if (type.equals("SUV")) {
            this.car = new SUVCar();
            runCarMethods();
        } else if (type.equals("Sedan")) {
            this.car = new SedanCar();
            runCarMethods();
        } else if (type.equals("Cabrio")) {
            this.car = new Cabrio();
            runCarMethods();
        } else if (type.equals("ElectricCar")) {
            this.car = new ElectricCar();
            runCarMethods();
        } else {
            throw new InvalidAttributeValueException("Not supported car type!");
        }

        return car;
    }

    private void runCarMethods() {
        car.manufactureCar();
        car.assembleCar();
        car.paintCar(Color.CYAN);
        car.testCar();
        car.deliverCar();
    }

}
