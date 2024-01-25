package pckg_shapes;

public interface BasicShape {

    String shapeName(String name);

    void draw();

    void resize(int size);

    String description();

    boolean isHide(int flag);
}
