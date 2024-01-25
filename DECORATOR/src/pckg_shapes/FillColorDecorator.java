package pckg_shapes;

public class FillColorDecorator extends ShapeDecorator {

    public FillColorDecorator(BasicShape shape2Decorate) {
        super(shape2Decorate);
    }

    void setFillColor(String color) {
        System.out.println("Fill color: " + color);
    }

    void setBasicShape2Dec(BasicShape shape2Decorate) {
        super.setShape2Decorate(shape2Decorate);
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
        return "FillColorDecorator{" +
                "shape2Decorate=" + shape2Decorate.getClass().getSimpleName() +
                '}';
    }
}
