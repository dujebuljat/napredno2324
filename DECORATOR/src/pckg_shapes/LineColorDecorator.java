package pckg_shapes;

public class LineColorDecorator extends ShapeDecorator{

    public LineColorDecorator(BasicShape shape2Decorate) {
        super(shape2Decorate);
    }

    void setLineColor(String color) {
        System.out.println("Line color: " + color);
    }

    @Override
    public String shapeName(String name) {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + shape2Decorate.getClass().getSimpleName() + "...");
    }

    @Override
    public void resize(int size) {
        System.out.println("Resizing " + shape2Decorate.getClass().getSimpleName() + ", " + size);
    }

    @Override
    public String description() {
        return toString();
    }

    @Override
    public boolean isHide(int flag) {
        return false;
    }

    @Override
    public String toString() {
        return "LineColorDecorator{" +
                "shape2Decorate=" + shape2Decorate.getClass().getSimpleName() +
                '}';
    }
}
