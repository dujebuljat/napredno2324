package pckg_factory_method;

import pckg_classic.*;

import javax.management.InvalidAttributeValueException;
import java.awt.*;

public class CarFactoryEU extends FactoryCarABS {

    private Car car;

    public Car produceCar(String type) throws InvalidAttributeValueException {


        if (type.equals("SUV_EU")) {
            this.car = new SUVCarEU();
            runCarMethods();
        } else if (type.equals("Sedan_EU")) {
            this.car = new SedanCarEU();
            runCarMethods();
        } else if (type.equals("Cabrio_EU")) {
            this.car = new CabrioEU();
            runCarMethods();
        } else if (type.equals("ElectricCar_EU")) {
            this.car = new ElectricCarEU();
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
