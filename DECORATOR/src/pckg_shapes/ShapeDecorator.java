package pckg_shapes;

public abstract class ShapeDecorator implements BasicShape {

    protected BasicShape shape2Decorate;

    public ShapeDecorator(BasicShape shape2Decorate) {
        this.shape2Decorate = shape2Decorate;
    }

    void setShape2Decorate(BasicShape shape2Decorate) {
        this.shape2Decorate = shape2Decorate;
    }
}
