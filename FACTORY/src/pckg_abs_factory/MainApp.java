package pckg_abs_factory;

public class MainApp {

    public static void main(String[] args) {

        AbstractGUIFactory guiFactory = new MacGUIFactory();
        AppClient appClient = new AppClient();
        appClient.setGuiFactory(guiFactory);
        appClient.createAppGUI();
    }
}
