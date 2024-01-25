package pckg_factory_method;

import pckg_classic.Car;

import javax.management.InvalidAttributeValueException;
import java.awt.*;

public class CarFactoryUK extends FactoryCarABS {

    private Car car;

    @Override
    public Car produceCar(String type) throws InvalidAttributeValueException {


        if (type.equals("SUV_UK")) {
            this.car = new SUVCarUK();
            runCarMethods();
        } else if (type.equals("Sedan_UK")) {
            this.car = new SedanCarUK();
            runCarMethods();
        } else if (type.equals("Cabrio_UK")) {
            this.car = new CabrioUK();
            runCarMethods();
        } else if (type.equals("ElectricCar_UK")) {
            this.car = new ElectricCarUK();
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
