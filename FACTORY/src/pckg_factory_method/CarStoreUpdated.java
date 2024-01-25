package pckg_factory_method;

import pckg_classic.Car;

import javax.management.InvalidAttributeValueException;

public class CarStoreUpdated {

    private FactoryCarABS factoryCarABS;

    public void setFactory(FactoryCarABS factoryCarABS) {
        this.factoryCarABS = factoryCarABS;
    }

    public Car produceCar(String type) throws InvalidAttributeValueException {
        return factoryCarABS.produceCar(type);
    }
}
