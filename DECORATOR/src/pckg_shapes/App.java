package pckg_shapes;

public class App {

    public static void main(String[] args) {

        Circle circle = new Circle("Circle");
        circle.draw();
        circle.resize(10);
        circle.shapeName("Circle1");
        System.out.println("Circle description: " + circle.description());
        ShapeDecorator fillColorDecorator = new FillColorDecorator(circle);
        fillColorDecorator.setShape2Decorate(circle);
        fillColorDecorator.draw();
        fillColorDecorator.resize(20);
        fillColorDecorator.shapeName("Circle2");
        System.out.println("Circle description: " + fillColorDecorator.description());

        System.out.println("========================================");

        ShapeDecorator lineColorDecorator = new LineColorDecorator(circle);
        lineColorDecorator.setShape2Decorate(circle);
        lineColorDecorator.draw();
        lineColorDecorator.resize(30);
        lineColorDecorator.shapeName("Circle3");
        System.out.println("Circle description: " + lineColorDecorator.description());



    }
}
