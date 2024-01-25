package pckg_abs_factory;

public class MacTextField extends TextField{
    protected MacTextField(int columns) {
        super(columns);
    }

    @Override
    public void createTextField() {
        System.out.println("Creating: " + getClass().getSimpleName());
    }

    @Override
    public void renderComponent() {
        System.out.println("Rendering after creation: " + getClass().getSimpleName());
    }
}
