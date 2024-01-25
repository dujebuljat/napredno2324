package pckg_lsp;

public class AppDevelopmentCompany {

    private Programmer programmer;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void developApp() {
        programmer.code();
        programmer.test();
        programmer.refactor();
        programmer.writeDocumentation();
        programmer.deployApp();
    }
}
