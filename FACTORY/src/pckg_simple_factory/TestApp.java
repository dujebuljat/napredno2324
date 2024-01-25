package pckg_simple_factory;

import pckg_classic.Car;

public class TestApp {

    public static void main(String[] args) {

        CarStoreNew carStoreNew = new CarStoreNew(new SimpleCarCreator());
        Car car = carStoreNew.produceCar("ElectricCar");
        System.out.println(car);
        car.driveCar();
    }
}
