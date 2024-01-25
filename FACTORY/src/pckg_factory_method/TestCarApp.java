package pckg_factory_method;

import pckg_classic.Car;

import javax.management.InvalidAttributeValueException;
import java.util.Scanner;

public class TestCarApp {

    private static FactoryCarABS factoryEU = new CarFactoryEU();
    private static FactoryCarABS factoryUK = new CarFactoryUK();
    private static final Scanner scanner = new Scanner(System.in);
    private static CarStoreUpdated carStoreUpdated = new CarStoreUpdated();
    private static Car car;


    public static void main(String[] args) {

        System.out.println("Please define region EU/UK?");
        String region = scanner.nextLine();
        if (region.equals("EU")) {
            carStoreUpdated.setFactory(factoryEU);
            System.out.println("What type of car do you want?");
            String type = scanner.nextLine();
            try {
                car = carStoreUpdated.produceCar(type);
                System.out.println(car);
            } catch (InvalidAttributeValueException e) {
                throw new RuntimeException(e);
            }
        }
        if (region.equals("UK")) {
            carStoreUpdated.setFactory(factoryUK);
            System.out.println("What type of car do you want?");
            String type = scanner.nextLine();
            try {
                car = carStoreUpdated.produceCar(type);
                System.out.println(car);
            } catch (InvalidAttributeValueException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
