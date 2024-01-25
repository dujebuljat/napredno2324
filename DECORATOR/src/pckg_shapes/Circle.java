package pckg_shapes;

public class Circle implements BasicShape{

    private String shName;

    public Circle(String name) {
        this.shName = name;
    }

    @Override
    public String shapeName(String name) {
        return null;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + shName + "...");
    }

    @Override
    public void resize(int size) {
        System.out.println("Resizing " + shName + ", " + size);
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
        return "Circle{" +
                "shName='" + shName + '\'' +
                '}';
    }
}
