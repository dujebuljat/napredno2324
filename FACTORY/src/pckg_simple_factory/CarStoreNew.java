package pckg_simple_factory;

import pckg_classic.Car;

import javax.management.InvalidAttributeValueException;

public class CarStoreNew {

    private SimpleCarCreator simpleCarCreator;

    public CarStoreNew(SimpleCarCreator simpleCarCreator) {
        this.simpleCarCreator = simpleCarCreator;
    }

    public Car produceCar(String type) {
        try {
            return simpleCarCreator.createCar(type);
        } catch (InvalidAttributeValueException iave) {
            System.out.println("Not supported car type!");
        }
        return null;
    }
}
