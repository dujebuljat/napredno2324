package pckg_icecream;

public class AppTest {

    public static void main(String[] args) {

        BaseIceCream chocolate = new ChocolateIceCream(2, 2);
        chocolate.makeIceCream();
        chocolate.iceCreamDescription();
        System.out.println(chocolate.getPrice());
        IceCreamDecorator decorator = new WhiteChocolateDecorator(chocolate, 1, 1.5);
        decorator.iceCreamDescription();
        decorator.makeIceCream();
        System.out.println("Total price: " + decorator.getPrice());

        System.out.println("====================================");

        IceCreamDecorator honey = new HoneyDecorator(decorator, 1, 10);
        honey.makeIceCream();
        honey.iceCreamDescription();
        System.out.println("Price: " + honey.getPrice());

        System.out.println("====================================");

        IceCreamDecorator decorator1 = new HoneyDecorator(new WhiteChocolateDecorator(chocolate, 1, 1.5), 1, 10);
        decorator1.iceCreamDescription();
        decorator1.makeIceCream();
        System.out.println("Total price: " + decorator1.getPrice());
    }
}
