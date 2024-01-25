package pckg_abs_factory;

public class AppClient {

    private AbstractGUIFactory guiFactory;

    public void setGuiFactory(AbstractGUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createAppGUI() {
        guiFactory.createGUI();
    }
}
