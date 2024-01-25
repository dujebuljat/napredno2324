package pckg_factory_method;

import pckg_classic.Car;

import javax.management.InvalidAttributeValueException;

public abstract class FactoryCarABS {

    public abstract Car produceCar(String type) throws InvalidAttributeValueException;
}
