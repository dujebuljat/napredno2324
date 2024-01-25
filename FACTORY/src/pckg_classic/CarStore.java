package pckg_classic;

import java.awt.*;

public class CarStore {

    private Car car;
    private String storeName;

    public CarStore(String storeName) {
        this.storeName = storeName;
    }

    public void createCar(String type) {
        if(type.equals("SUV")) {
            this.car = new SUVCar();
            runCarMethods();
        }
        if (type.equals("Sedan")) {
            this.car = new SedanCar();
            runCarMethods();
        }
        if (type.equals("Cabrio")) {
            this.car = new Cabrio();
            runCarMethods();
        }

    }

    private void runCarMethods() {
        car.manufactureCar();
        car.assembleCar();
        car.paintCar(Color.CYAN);
        car.testCar();
        car.deliverCar();
    }
}
